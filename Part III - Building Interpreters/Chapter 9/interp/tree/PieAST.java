package tree;

import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import lexer.Token;

public class PieAST extends TerminalNodeImpl {
    public Scope scope; // recorded in parser, used in visitor

    public PieAST(Token t) {
        super(t);
    }
}
