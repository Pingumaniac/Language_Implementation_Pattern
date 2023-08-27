package classes;

import org.antlr.v4.runtime.tree.ParseTree;
import lexer.Token;

public class CymbolAST extends ParseTree {
    public Scope scope;   // set by Def.g; ID lives in which scope?
    public Symbol symbol; // set by Ref.g; point at def in symbol table
    public CymbolAST(Token t) { super(t); }
}
