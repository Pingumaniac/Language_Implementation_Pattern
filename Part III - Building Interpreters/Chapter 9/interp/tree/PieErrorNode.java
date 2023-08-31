package tree;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNodeImpl;

public class PieErrorNode extends ErrorNodeImpl {
    public PieErrorNode(Token token) {
        super(token);
    }
}
