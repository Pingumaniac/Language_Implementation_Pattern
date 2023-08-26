package embedded;

public class IntNode extends ExprNode {
    public IntNode(Token token) { super(token); }
    public void visit(VecMathVisitor visitor) { visitor.visit(this); }
}
