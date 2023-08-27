package nested;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
    public static void main(String[] args) throws Exception {
        CharStream input;
        if (args.length > 0) {
            input = CharStreams.fromFileName(args[0]);
        } else {
            input = CharStreams.fromStream(System.in);
        }

        CymbolLexer lex = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        CymbolParser p = new CymbolParser(tokens);
        ParseTree tree = p.compilationUnit(); // launch parser

        SymbolTable symtab = new SymbolTable(); // make global scope, types
        DefRefVisitor def = new DefRefVisitor(symtab); // you'll have to create this class
        def.visit(tree); // walk the tree and populate symbol table

        System.out.println("globals: " + symtab.globals);
    }
}

