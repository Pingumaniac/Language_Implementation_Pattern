package embedded;

public class AddNode extends ExprNode {
    ExprNode left, right;
    public AddNode(ExprNode left, Token token, ExprNode right) {
        super(token); this.left = left; this.right = right;
    }
    public void visit(VecMathVisitor visitor) { visitor.visit(this); }
    public void print() {
        left.print(); System.out.print(" + "); right.print();
    }
}
