package classes;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {

    public static void main(String[] args) throws Exception {
        CharStream input = null;
        if (args.length > 0) {
            input = CharStreams.fromFileName(args[0]);
        } else {
            input = CharStreams.fromStream(System.in);
        }

        // Create lexer/parser to build trees from stdin
        CymbolLexer lex = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        CymbolParser parser = new CymbolParser(tokens);
        ParseTree tree = parser.compilationUnit();  // Launch parser by calling start rule

        // Build custom ParseTreeWalker if any special handling is needed for walking the tree
        ParseTreeWalker walker = new ParseTreeWalker();

        SymbolTable symtab = new SymbolTable();  // Initialize symbol table

        // Create Def phase listener and walk the tree
        Def def = new Def(symtab);
        walker.walk(def, tree);
        System.out.println("globals: " + symtab.globals);

        // Create Ref phase listener and walk the tree again
        Ref ref = new Ref(symtab);
        walker.walk(ref, tree);
    }
}

