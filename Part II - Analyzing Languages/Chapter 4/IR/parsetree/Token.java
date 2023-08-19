package parsetree;

public class Token {
    public int type;
    public String text;
    public Token(int type, String text) {
        this.type = type;
        this.text = text;
    }
    public String toString() {
        String tname = ListLexer.tokenNames[type];
        return "<'" + text + "'," + tname + ">";
    }
    public static int INVALID_TOKEN_TYPE = 0;
    public static int EOF_TYPE = 1;
    public static int NAME = 2;
    public static int COMMA = 3;
    public static int LBRACK = 4;
    public static int RBACK = 5;
    public static int PLUS = 6;
    public static int INT = 7;
    public static String[] tokenNames = {
        "n/a", "<EOF>", "NAME", "COMMA", "LBRACK", "RBACK", "PLUS", "INT"
    };
}
