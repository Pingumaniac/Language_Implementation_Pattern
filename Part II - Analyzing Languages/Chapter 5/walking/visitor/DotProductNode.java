package visitor;

public class DotProductNode extends ExprNode {
    ExprNode left, right;
    public DotProductNode(ExprNode left, Token token, ExprNode right) {
        super(token); this.left = left; this.right = right;
    }
    @Override
    public void visit(VecMathVisitor visitor) { visitor.visit(this); }
}
