package tree_grammar;

public class AddNode extends ExprNode {
    ExprNode left, right;
    public AddNode(ExprNode left, Token token, ExprNode right) {
        super(token); this.left = left; this.right = right;
    }
    @Override
    public void visit(VecMathVisitor visitor) { visitor.visit(this); }
    public void print() {
        left.print(); System.out.print(" + "); right.print();
    }
}
