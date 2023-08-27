package monolithic;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
    public static void main(String[] args) throws Exception {
        CharStream input = null; // read from filename or stdin
        if ( args.length>0 ) input = new ANTLRFileStream(args[0]);
        else input = new ANTLRInputStream(System.in);
        CymbolLexer lex = new CymbolLexer(input);  // create lexer
        CommonTokenStream tokens = new CommonTokenStream(lex);
        CymbolParser p = new CymbolParser(tokens); // create parser
        SymbolTable symtab = new SymbolTable();    // create symbol table
        p.compilationUnit(symtab);                 // launch parser
        System.out.println("globals: "+symtab.symbols);
    }
}
