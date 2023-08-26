package visitor;

public abstract class ExprNode extends VecMathNode {
    public ExprNode(Token t) { super(t); }
    public abstract void visit(VecMathVisitor visitor);
}
