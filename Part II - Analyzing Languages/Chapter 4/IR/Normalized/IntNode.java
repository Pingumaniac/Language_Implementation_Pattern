package Normalized;

import parsetree.Token;

public class IntNode extends ExprNode {
    public IntNode(Token t) {
        super(t);
        evalType = tINTEGER;
    }
}
