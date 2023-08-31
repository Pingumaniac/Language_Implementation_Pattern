package promote;

import org.antlr.runtime.TokenStream;

import java.util.List;

public class SymbolTable {
    public static final int tUSER = 0;
    public static final int tBOOLEAN = 1;
    public static final int tCHAR = 2;
    public static final int tINT = 3;
    public static final int tFLOAT = 4;
    public static final int tVOID = 5;

    public static final BuiltInTypeSymbol _boolean = new BuiltInTypeSymbol("boolean", tBOOLEAN);
    public static final BuiltInTypeSymbol _char = new BuiltInTypeSymbol("char", tCHAR);
    public static final BuiltInTypeSymbol _int = new BuiltInTypeSymbol("int", tINT);
    public static final BuiltInTypeSymbol _float = new BuiltInTypeSymbol("float", tFLOAT);
    public static final BuiltInTypeSymbol _void = new BuiltInTypeSymbol("void", tVOID);

    public CymbolListener listener =
        new CymbolListener() {
            public void info(String msg) { System.out.println(msg); }
            public void error(String msg) { System.err.println(msg); }
        };


    public static final Type[] indexToType = { null, _boolean, _char, _int, _float, _void };

    public static final Type[][] arithmeticResultType = new Type[][] {
        /*          struct  boolean  char    int     float,   void */
        /*struct*/  {_void, _void,   _void,  _void,  _void,   _void},
        /*boolean*/ {_void, _void,   _void,  _void,  _void,   _void},
        /*char*/    {_void, _void,   _char,  _int,   _float,  _void},
        /*int*/     {_void, _void,   _int,   _int,   _float,  _void},
        /*float*/   {_void, _void,   _float, _float, _float,  _void},
        /*void*/    {_void, _void,   _void,  _void,  _void,   _void}
    };

    public static final Type[][] relationalResultType = new Type[][] {
        /*          struct  boolean char      int       float,    void */
        /*struct*/  {_void, _void,  _void,    _void,    _void,    _void},
        /*boolean*/ {_void, _void,  _void,    _void,    _void,    _void},
        /*char*/    {_void, _void,  _boolean, _boolean, _boolean, _void},
        /*int*/     {_void, _void,  _boolean, _boolean, _boolean, _void},
        /*float*/   {_void, _void,  _boolean, _boolean, _boolean, _void},
        /*void*/    {_void, _void,  _void,    _void,    _void,    _void}
    };

    public static final Type[][] equalityResultType = new Type[][] {
        /*           struct boolean   char      int       float,    void */
        /*struct*/  {_void, _void,    _void,    _void,    _void,    _void},
        /*boolean*/ {_void, _boolean, _void,    _void,    _void,    _void},
        /*char*/    {_void, _void,    _boolean, _boolean, _boolean, _void},
        /*int*/     {_void, _void,    _boolean, _boolean, _boolean, _void},
        /*float*/   {_void, _void,    _boolean, _boolean, _boolean, _void},
        /*void*/    {_void, _void,    _void,    _void,    _void,    _void}
    };

    public static final Type[][] promoteFromTo = new Type[][] {
        /*          struct  boolean  char    int     float,   void */
        /*struct*/  {null,  null,    null,   null,   null,    null},
        /*boolean*/ {null,  null,    null,   null,   null,    null},
        /*char*/    {null,  null,    null,   _int,   _float,  null},
        /*int*/     {null,  null,    null,   null,   _float,  null},
        /*float*/   {null,  null,    null,   null,    null,   null},
        /*void*/    {null,  null,    null,   null,    null,   null}
    };

    GlobalScope globals = new GlobalScope();
    public SymbolTable() { initTypeSystem(); }

    protected void initTypeSystem() {
        for (Type t : indexToType) {
            if ( t!=null ) globals.define((BuiltInTypeSymbol)t);
        }
    }

    public Type getResultType(Type[][] typeTable, CymbolAST a, CymbolAST b) {
        int ta = a.evalType.getTypeIndex(); // type index of left operand
        int tb = b.evalType.getTypeIndex(); // type index of right operand
        Type result = typeTable[ta][tb];    // operation result type
        // promote left to right or right to left?
        a.promoteToType = promoteFromTo[ta][ta];
        b.promoteToType = promoteFromTo[tb][tb];
        return result;
    }

    public Type bop(CymbolAST a, CymbolAST b) {
        return getResultType(arithmeticResultType, a, b);
    }
    public Type relop(CymbolAST a, CymbolAST b) {
        return getResultType(relationalResultType, a, b);
    }
    public Type eqop(CymbolAST a, CymbolAST b) {
        return getResultType(equalityResultType, a, b);
    }
    public Type uminus(CymbolAST a) { return a.evalType; }
    public Type unot(CymbolAST a)   { return _boolean; }

    public Type arrayIndex(CymbolAST id, CymbolAST index) {
        Symbol s = id.scope.resolve(id.getText()); // resolve variable
        VariableSymbol vs = (VariableSymbol)s;
        id.symbol = vs;                            // annotate AST
        Type t = ((ArrayType)vs.type).elementType; // get element type
        int texpr = index.evalType.getTypeIndex();
        index.promoteToType = promoteFromTo[texpr][tINT]; // promote index?
        return t;
    }

    public Type call(CymbolAST id, List args) {
        Symbol s = id.scope.resolve(id.getText());
        MethodSymbol ms = (MethodSymbol)s;
        id.symbol = ms;
        int i = 0;
        for (Symbol a : ms.orderedArgs.values() ) { // for each arg
            CymbolAST argAST = (CymbolAST)args.get(i++);
            // get argument expression type and expected type
            Type actualArgType = argAST.evalType;
            Type formalArgType = ((VariableSymbol)a).type;
            int targ = actualArgType.getTypeIndex();
            int tformal = formalArgType.getTypeIndex();
            // do we need to promote argument type to defined type?
            argAST.promoteToType = promoteFromTo[targ][tformal];
        }
        return ms.type;
    }

    public Type member(CymbolAST expr, CymbolAST field) {
        StructSymbol scope=(StructSymbol)expr.evalType; // get scope of expr
        Symbol s = scope.resolveMember(field.getText());// resolve ID in scope
        field.symbol = s;  // make AST point into symbol table
        return s.type;     // return ID's type
    }

    public void declinit(CymbolAST id, CymbolAST init) {
        int te = init.evalType.getTypeIndex(); //promote expr to decl type?
        int tdecl = id.symbol.type.getTypeIndex();
        init.promoteToType = promoteFromTo[te][tdecl];
    }
    public void ret(MethodSymbol ms, CymbolAST expr) {
        Type retType = ms.type; //promote return expr to function decl type?
        Type exprType = expr.evalType;
        int texpr = exprType.getTypeIndex();
        int tret = retType.getTypeIndex();
        expr.promoteToType = promoteFromTo[texpr][tret];
    }
    public void assign(CymbolAST lhs, CymbolAST rhs) {
        int tlhs = lhs.evalType.getTypeIndex(); // promote right to left?
        int trhs = rhs.evalType.getTypeIndex();
        rhs.promoteToType = promoteFromTo[trhs][tlhs];
    }

    public String toString() { return globals.toString(); }
}
