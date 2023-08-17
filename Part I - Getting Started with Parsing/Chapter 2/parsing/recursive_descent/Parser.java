package recursive_descent;

import lexer.Token;
import lexer.Lexer;

public class Parser {
    Lexer input;
    Token lookahead;
    public void match(int x) {
        if (lookahead.type == x) consume();
        else throw new Error("expecting " + input.getTokenName(x) +
            "; found " + lookahead);
    }
    public void consume() { lookahead = input.nextToken(); }
    public Parser(Lexer input) { this.input = input; consume(); }
}
