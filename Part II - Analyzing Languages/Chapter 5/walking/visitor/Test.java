package visitor;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static IntNode I_Node(int i) {
        return new IntNode(new Token(Token.INT, String.valueOf(i)));
    }
    public static void main(String[] args) {
        List<StatNode> stats = new ArrayList<StatNode>();
        AddNode a_node = new AddNode(I_Node(3),new Token(Token.PLUS, ""), I_Node(4));
        VarNode x_node_1 = new VarNode(new Token(Token.ID,"x"));
        AssignNode assign_node = new AssignNode(x_node_1, new Token(Token.ASSIGN,"="), a_node);
        stats.add(assign_node);
        Token mult = new Token(Token.MULT,"*");
        List<ExprNode> elements = new ArrayList<ExprNode>();
        elements.add(I_Node(2));
        elements.add(I_Node(3));
        elements.add(I_Node(4));
        VectorNode vector_node = new VectorNode(new Token(Token.VEC, ""), elements);
        VarNode x_node_2 = new VarNode(new Token(Token.ID,"x"));
        ExprNode print_value = new MultNode(x_node_2, mult, vector_node);
        PrintNode print_node = new PrintNode(new Token(Token.PRINT,"print"), print_value);
        stats.add(print_node);
        StatListNode statlist = new StatListNode(stats);
        statlist.print(); // Launch embedded walker

        PrintVisitor visitor = new PrintVisitor();
        statlist.visit(visitor); // tell root node to visit with this visitor

        IndependentPrintVisitor indepVisitor = new IndependentPrintVisitor();
        indepVisitor.print(statlist); // tell visitor to print from root
    }
}
