package ast;

public class GenDOT {
    public static void main(String[] args) throws Exception {
        Tree t = new Tree("VAR");
        t.addChild( new Tree("int") );
        t.addChild( new Tree("x") );
        Tree m = new Tree("+");
        m.addChild( new Tree("3") );
        m.addChild( new Tree("4") );
        t.addChild( m );
        ASTViz viz = new ASTViz(t);
        System.out.println(viz.toString());
    }

}
