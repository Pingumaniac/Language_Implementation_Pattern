package embedded;

public class MultNode extends ExprNode {
    ExprNode left, right;
    public MultNode(ExprNode left, Token token, ExprNode right) {
        super(token); this.left = left; this.right = right;
    }
    public void visit(VecMathVisitor visitor) { visitor.visit(this); }
}
