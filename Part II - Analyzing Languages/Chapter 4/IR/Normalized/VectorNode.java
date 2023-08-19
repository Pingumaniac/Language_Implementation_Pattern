package Normalized;

import java.util.List;
import parsetree.Token;

public class VectorNode extends ExprNode {
    public VectorNode(Token t, List<ExprNode> elements) {
        super(t);
        evalType = tVECTOR;
        for (ExprNode e : elements) { addChild(e); }
    }
}
