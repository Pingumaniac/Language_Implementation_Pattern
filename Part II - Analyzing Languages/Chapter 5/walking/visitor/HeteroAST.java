package visitor;

public class HeteroAST {
    Token token;
    public HeteroAST() { ; }
    public HeteroAST(Token t) { token = t; }
    public String toString() { return token.toString(); }
}
