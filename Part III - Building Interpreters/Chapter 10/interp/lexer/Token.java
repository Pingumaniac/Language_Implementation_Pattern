package lexer;

public class Token {
    public int type;
    public String text;
    public Token(int type, String text) { this.type = type; this.text = text; }
    public String toString() {
        String tname = ListLexer.tokenNames[type];
        return "<'" + text + "'," + tname + ">";
    }
    public static int RBACK = 5;
    public static String[] tokenNames = {
        "n/a", "<EOF>", "NAME", "COMMA", "LBRACK", "RBACK"
    };
}
