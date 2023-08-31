package ast;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.IOException;

public class ASTViz {
    STGroup templates;
    int counter = 1;  // used to make unique names
    Tree root;

    public ASTViz(Tree root) throws IOException {
        this.root = root;
        templates = new STGroupFile("DOT.stg");
    }

    public String toString() {
        ST fileST = templates.getInstanceOf("file");
        fileST.add("gname", "testgraph");
        counter = 1;
        walk(root, fileST);
        return fileST.render();
    }

    protected ST walk(Tree tree, ST fileST) {
        ST parentST = getNodeST(tree);
        fileST.add("nodes", parentST);
        if (tree.getChildCount() == 0) return parentST;

        for (Tree child : tree.children) {
            ST childST = walk(child, fileST);
            Object from = parentST.getAttribute("name");
            Object to = childST.getAttribute("name");
            ST edgeST = getEdgeST(from, to);
            fileST.add("edges", edgeST.render());
        }
        return parentST;
    }

    protected ST getEdgeST(Object from, Object to) {
        ST edgeST = templates.getInstanceOf("edge");
        edgeST.add("from", from);
        edgeST.add("to", to);
        return edgeST;
    }

    protected ST getNodeST(Tree t) {
        ST nodeST = templates.getInstanceOf("node");
        String uniqueName = "node" + counter++;
        nodeST.add("name", uniqueName);
        nodeST.add("text", t.payload);
        return nodeST;
    }
}
