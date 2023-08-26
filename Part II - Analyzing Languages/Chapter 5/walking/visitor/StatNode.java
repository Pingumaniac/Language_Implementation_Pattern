package visitor;

public abstract class StatNode extends VecMathNode {
    public StatNode() {;}
    public StatNode(Token t) { super(t); }
    public abstract void visit(VecMathVisitor visitor);
}
