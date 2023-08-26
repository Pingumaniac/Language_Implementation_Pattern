package tree_grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
    public static void main(String[] args) throws Exception {
        // Create lexer/parser to build trees from stdin
        CharStream input = CharStreams.fromStream(System.in);
        VecMathLexer lex = new VecMathLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        VecMathParser p = new VecMathParser(tokens);
        ParseTree tree = p.prog(); // launch parser by calling start rule

        // Print the tree in LISP style
        System.out.println(tree.toStringTree(p));

        // Walk the tree with the visitor
        PrintVisitor printer = new PrintVisitor();
        printer.visit(tree);
    }
}

