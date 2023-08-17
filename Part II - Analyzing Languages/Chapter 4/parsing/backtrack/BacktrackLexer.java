package backtrack;

import lexer.Lexer;
import lexer.Token;

// used from codes for LL(k) Recursive Descent Parser
public class BacktrackLexer extends Lexer {
    // Define constants for token types
    public static int NAME = 2;
    public static int EQUALS = 6; // Assuming '=' is a token type you want to track
    public static int LBRACK = 4;
    public static int RBRACK = 5;
    public static int COMMA = 3;
    public static String[] tokenNames = {
        "n/a", "<EOF>", "NAME", "COMMA", "LBRACK", "RBRACK", "EQUALS"
    };
    @Override
    public String getTokenName(int x) { return tokenNames[x]; }
    public BacktrackLexer(String input) { super(input); }
    public boolean isLETTER() {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }
    @Override
    public Token nextToken() {
        while (c != EOF) {
            switch (c) {
                case ' ': case '\t': case '\n': case '\r': WS(); continue;
                case ',': consume(); return new Token(COMMA, ",");
                case '[': consume(); return new Token(LBRACK, "[");
                case ']': consume(); return new Token(RBRACK, "]");
                case '=': consume(); return new Token(EQUALS, "="); // new token
                default:
                    if (isLETTER()) return NAME();
                    throw new Error("invalid character: " + c);
            }
        }
        return new Token(EOF_TYPE, "<EOF>");
    }
    Token NAME() {
        StringBuilder buf = new StringBuilder();
        do { buf.append(c); consume(); } while (isLETTER());
        return new Token(NAME, buf.toString());
    }
    void WS() {
        while (c == ' ' || c == '\t' || c == '\n' || c == '\r') consume();
    }
}
