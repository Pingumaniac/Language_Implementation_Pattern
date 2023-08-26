package patterns;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
    public static void main(String[] args) {
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
        // Traverse tree down then up, applying rewrite rules
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        Simplify s = new Simplify(nodes);
        t = (CommonTree) s.downup(t, true); // walk t, trace transforms
        System.out.println("Simplified tree: " + t.toStringTree());

    }
}
