package tree_grammar;

public class ListLexer extends Lexer {
    public static final int NAME = 2;
    public static final int COMMA = 3;
    public static final int LBRACK = 4;
    public static final int RBRACK = 5;
    public static String[] tokenNames = {
        "n/a", "<EOF>", "NAME", "COMMA", "LBRACK", "RBRACK"
    };
    @Override
    public String getTokenName(int x) { return tokenNames[x]; }
    public ListLexer(String input) { super(input); }
    public boolean isLETTER() {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }
    public Token nextToken() {
        while (c != EOF) {
            switch (c) {
                case ' ': case '\t': case '\n': case '\r': WS(); continue;
                case ',': consume(); return new Token(COMMA, ",");
                case '[': consume(); return new Token(LBRACK, "[");
                case ']': consume(); return new Token(RBRACK, "]");
                default:
                    if (isLETTER()) return NAME();
                    throw new Error("invalid character: " + c);
            }
        }
        return new Token(EOF_TYPE, "<EOF>");
    }
    Token NAME() {
        StringBuilder buf = new StringBuilder();
        do {  buf.append(c);  consume();  } while (isLETTER());
        return new Token(NAME, buf.toString());
    }
    void WS() {
        while (c == ' ' || c == '\t' || c == '\n' || c == '\r') consume();
    }
}

