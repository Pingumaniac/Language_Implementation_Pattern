package Hetero;

import parsetree.Token;

public abstract class HeteroAST {
    protected Token token;
    public HeteroAST() {;}
    public HeteroAST(Token t) { token = t; }
    public HeteroAST(int tokenType) { this.token = new Token(tokenType, ""); }
    public String toString() { return token.toString(); }
    public String toStringTree() { return toString(); }
}
