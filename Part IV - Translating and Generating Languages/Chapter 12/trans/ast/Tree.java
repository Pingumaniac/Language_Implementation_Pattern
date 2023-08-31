package ast;

import java.util.List;
import java.util.ArrayList;

public class Tree {
    String payload;
    List<Tree> children = new ArrayList<Tree>();
    public Tree(String payload) { this.payload = payload; }
    public void addChild(Tree t) { children.add(t); }
    public int getChildCount() { return children.size(); }
}
