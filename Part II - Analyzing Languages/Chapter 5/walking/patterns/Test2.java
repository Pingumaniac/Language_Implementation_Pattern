package patterns;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test2 {
    public static void main(String[] args)  {
        CharStream input = null;
        if (args.length > 0) {
            input = new ANTLRStringStream(args[0]);
        } else {
            input = new ANTLRInputStream(System.in);
        }
        VecMathLexer lex = new VecMathLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        VecMathParser p = new VecMathParser(tokens);
        RuleReturnScope r = p.prog();
        CommonTree t = (CommonTree) r.getTree();

        System.out.println("Original tree: " + t.toStringTree());
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        Reduce red = new Reduce(nodes);
        t = (CommonTree) red.downup(t, true); // walk t, trace transforms
        System.out.println("Simplified tree: " + t.toStringTree());
    }
}
