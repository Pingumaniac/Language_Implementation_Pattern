package visitor;

public class Token {
    public int type;
    public String text;
    public static final int INVALID_TOKEN_TYPE = 0;
    public static final int EOF_TYPE = 1;
    public static final int NAME = 2;
    public static final int COMMA = 3;
    public static final int LBRACK = 4;
    public static final int RBACK = 5;
    public static final int PLUS = 6;
    public static final int MULT = 7;
    public static final int DOT = 8;
    public static final int INT = 9;
    public static final int VEC = 10;
    public static final int ID = 11;
    public static final int ASSIGN = 12;
    public static final int PRINT = 13;
    public static final int STAT_LIST = 14;


    public Token(int type, String text) {
        this.type = type; this.text = text;
    }
    public String toString() {
        String tname = ListLexer.tokenNames[type];
        return "<'" + text + "'," + tname + ">";
    }
    public static String[] tokenNames = {
        "n/a", "<EOF>", "NAME", "COMMA", "LBRACK", "RBACK", "PLUS", "INT"
    };
}
