package Homo;

import java.util.List;
import java.util.ArrayList;

import parsetree.Token;

public class AST {
    Token token;
    public List<AST> children;
    public AST() { ; }
    public AST(Token token) { this.token = token; }
    public AST(int tokenType) {
        this.token = new Token(tokenType, Integer.toString(tokenType));
    }
    public int getNodeType() { return token.type; }
    public void addChild(AST child) {
        if (children == null) children = new ArrayList<AST>();
        children.add(child);
    }
    public boolean isNil() { return token==null; }
    public String toString() { return token!=null?token.toString():"nil"; }
    public String toStringTree() {
        if (children==null || children.size() == 0) return this.toString();
        StringBuilder buf = new StringBuilder();
        if ( !isNil() ) {
            buf.append("(");
            buf.append(this.toString());
            buf.append(' ');
        }
        for (int i = 0; i < children.size(); i++) {
            AST t = (AST)children.get(i); // normalized unnamed children
            if ( i>0 ) buf.append(' ');
            buf.append(t.toStringTree());
        }
        if ( !isNil() ) buf.append(")");
        return buf.toString();
    }
}
