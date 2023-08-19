package Normalized;

import parsetree.Token;
import Homo.AST;

public abstract class ExprNode extends AST {
    static final int tINVALID = 0;
    static final int tINTEGER = 1;
    static final int tVECTOR = 2;
    int evalType;
    ExprNode(Token payload) { super(payload); }
    public int getEvalType() { return evalType; }
    public String toString() {
        if (evalType != tINVALID) {
            return super.toString() + "<type=" +
                (evalType == tINTEGER ? "tINTEGER" : "tVECTOR") + ">";
        }
        return super.toString();
    }
}
