package tree;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Stack;
import lexer.Token;

public class Interpreter {
    public InterpreterListener listener =
        new InterpreterListener() {
            public void info(String msg) { System.out.println(msg); }
            public void error(String msg) { System.err.println(msg); }
            public void error(String msg, Exception e) {
                error(msg); e.printStackTrace(System.err);
            }
            public void error(String msg, Token t) {
                error("line " + t.getLine() + ": " + msg);
            }
        };

    public static final ReturnValue sharedReturnValue = new ReturnValue();

    GlobalScope globalScope;
    MemorySpace globals = new MemorySpace("globals");
    MemorySpace currentSpace = globals;
    Stack<FunctionSpace> stack = new Stack<>();
    ParseTree root;
    CommonTokenStream tokens;
    PieLexer lex;
    PieParser parser;

    public void interp(InputStream input) throws IOException {
        globalScope = new GlobalScope();
        lex = new PieLexer(CharStreams.fromStream(input));
        tokens = new CommonTokenStream(lex);
        parser = new PieParser(tokens, this);

        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                listener.error("line " + line + ":" + charPositionInLine + " " + msg);
            }
        });

        ParseTree r = parser.program();
        if (parser.getNumberOfSyntaxErrors()==0) {
            root = (PieAST)r.getTree();
            block(root);
        }
    }

    public Object exec(PieAST t) {
        try {
            switch ( t.getType() ) {
                case PieParser.BLOCK : block(t); break;
                case PieParser.ASSIGN : assign(t); break;
                case PieParser.RETURN : ret(t); break;
                case PieParser.PRINT : print(t); break;
                case PieParser.IF : ifstat(t); break;
                case PieParser.WHILE : whileloop(t); break;
                case PieParser.CALL : return call(t);
                case PieParser.NEW : return instance(t);
                case PieParser.ADD : return add(t);
                case PieParser.SUB : return op(t);
                case PieParser.MUL : return op(t);
                case PieParser.EQ : return eq(t);
                case PieParser.LT : return lt(t);
                case PieParser.INT : return Integer.parseInt(t.getText());
                case PieParser.CHAR : return new Character(t.getText().charAt(1));
                case PieParser.FLOAT : return Float.parseFloat(t.getText());
                case PieParser.STRING :
                    String s = t.getText();
                    return s.substring(1,s.length()-1);
                case PieParser.DOT :
                case PieParser.ID :
                    return load(t);
                default : // catch unhandled node types
                    throw new UnsupportedOperationException("Node "+
                        t.getText()+"<"+t.getType()+"> not handled");
            }
        }
        catch (Exception e) {
            listener.error("problem executing "+t.toStringTree(), e);
        }
        return null;
    }

    public void block(PieAST t) {
        if (t.getType()!=PieParser.BLOCK) {
            listener.error("not a block: "+t.toStringTree());
        } else {
            List<PieAST> stats = t.getChildren();
            for (PieAST x : stats) exec(x);
        }
    }

    public void assign(PieAST t) {
        PieAST lhs = (PieAST)t.getChild(0);
        PieAST expr = (PieAST)t.getChild(1);
        Object value = exec(expr);
        if (lhs.getType()==PieParser.DOT) {
            fieldassign(lhs, value);
            return;
        }
        // var assign ^('=' a expr)
        MemorySpace space = getSpaceWithSymbol(lhs.getText());
        if ( space==null ) space = currentSpace;
        space.put(lhs.getText(), value);
    }

    public MemorySpace getSpaceWithSymbol(String id) {
        if (stack.size() > 0 && stack.peek().get(id) != null) return stack.peek();
        if (globals.get(id) != null) return globals;
        return null;
    }

    public Object call(PieAST t) {
        String fname = t.getChild(0).getText();
        FunctionSymbol fs = (FunctionSymbol)t.scope.resolve(fname);
        if (fs ==null) {
            listener.error("no such function "+fname, t.token);
            return null;
        }
        FunctionSpace fspace = new FunctionSpace(fs);
        MemorySpace saveSpace = currentSpace;
        currentSpace = fspace;

        int argCount = t.getChildCount() - 1;
        if (fs.formalArgs == null && argCount > 0 || fs.formalArgs != null
            && fs.formalArgs.size() != argCount) {
            listener.error("function "+fs.name+" argument list mismatch");
            return null;
        }
        int i = 0;
        for (Symbol argS : fs.formalArgs.values()) {
            VariableSymbol arg = (VariableSymbol)argS;
            PieAST ithArg = (PieAST)t.getChild(i+1);
            Object argValue = exec(ithArg);
            fspace.put(arg.name, argValue);
            i++;
        }
        Object result = null;
        stack.push(fspace);
        try { exec(fs.blockAST); }
        catch (ReturnValue rv) { result = rv.value; }
        stack.pop();
        currentSpace = saveSpace;
        return result;
    }

    public void ret(PieAST t) {
        sharedReturnValue.value = exec((PieAST)t.getChild(0));
        throw sharedReturnValue;
    }

    public void print(PieAST t) {
        PieAST expr = (PieAST)t.getChild(0);
        System.out.println( exec(expr) );
    }

    public void fieldassign(PieAST lhs, Object value) {
        PieAST o = (PieAST) lhs.getChild(0);
        PieAST f = (PieAST) lhs.getChild(1);
        String fieldname = f.getText();
        Object a = load(o);
        if (!(a instanceof StructInstance)) {
            String leftpart = parser.input.toString(lhs.getTokenStartIndex(), lhs.getTokenStopIndex()-2);
            String all = parser.input.toString(lhs.getTokenStartIndex(), lhs.getTokenStopIndex());
            listener.error(leftpart+" is not a struct in "+all, o.token);
            return;
        }
        StructInstance struct = (StructInstance)a;
        if (struct.def.resolveMember(fieldname) == null) {
            listener.error("can't assign; " + struct.name + " has no " +
                fieldname + " field", f.token);
            return;
        }
        struct.put(fieldname, value);
    }

    public void whileloop(PieAST t) {
        PieAST condStart = (PieAST)t.getChild(0);
        PieAST codeStart = (PieAST)t.getChild(1);
        Boolean c = (Boolean)exec(condStart);
        while ( c ) {
            exec(codeStart);
            c = (Boolean)exec(condStart);
        }
    }

    public void ifstat(PieAST t) {
        PieAST condStart = (PieAST)t.getChild(0);
        PieAST codeStart = (PieAST)t.getChild(1);
        PieAST elseCodeStart = null;
        if ( t.getChildCount()==3 ) elseCodeStart = (PieAST)t.getChild(2);
        Boolean c = (Boolean)exec(condStart);
        if ( ((Boolean)c).booleanValue() ) exec(codeStart);
        else if ( elseCodeStart!=null ) exec(elseCodeStart);
    }

    public boolean eq(PieAST t) {
        Object a = exec((PieAST)t.getChild(0));
        Object b = exec((PieAST)t.getChild(1));
        return a.equals(b);
    }

    public boolean lt(PieAST t) {
        Object a = exec((PieAST)t.getChild(0));
        Object b = exec((PieAST)t.getChild(1));
        if (a instanceof Number && b instanceof Number) {
            Number x = (Number)a;
            Number y = (Number)b;
            return x.floatValue() < y.floatValue();
        }
        return false;
    }

    public Object op(PieAST t) {
        Object a = exec((PieAST)t.getChild(0));
        Object b = exec((PieAST)t.getChild(1));
        if (a instanceof Float || b instanceof Float) {
            float x = ((Number)a).floatValue();
            float y = ((Number)b).floatValue();
            switch (t.getType()) {
                case PieParser.ADD : return x + y;
                case PieParser.SUB : return x - y;
                case PieParser.MUL : return x * y;
            }
        }
        if (a instanceof Integer || b instanceof Integer) {
            int x = ((Number)a).intValue();
            int y = ((Number)b).intValue();
            switch (t.getType()) {
                case PieParser.ADD : return x + y;
                case PieParser.SUB : return x - y;
                case PieParser.MUL : return x * y;
            }
        }
        return 0;
    }

    public Object add(PieAST t) {
        Object a = exec((PieAST)t.getChild(0));
        Object b = exec((PieAST)t.getChild(1));
        if (a instanceof String || b instanceof String) {
            return a.toString() + b.toString();
        }
        return op(t);
    }

    public Object load(PieAST t) {
        if ( t.getType()==PieParser.DOT ) return fieldload(t);
        MemorySpace s = getSpaceWithSymbol(t.getText());
        if ( s!=null ) return s.get(t.getText());
        listener.error("no such variable "+t.getText(), t.token);
        return null;
    }

    public Object fieldload(PieAST t) {
        PieAST expr = (PieAST)t.getChild(0);
        PieAST b = (PieAST)t.getChild(1);
        String id = b.getText();
        StructInstance struct = (StructInstance)load(expr);
        if (struct.def.resolveMember(id) == null) {
            listener.error(struct.name+" has no "+id+" field", b.token);
            return null;
        }
        return struct.get(id);
    }

    public StructInstance instance(PieAST t) {
        PieAST structNameNode = (PieAST)t.getChild(0);
        StructSymbol s = (StructSymbol)structNameNode.scope.resolve(structNameNode.getText());
        return new StructInstance(s);
    }
}
