package memoize;

public class Test {
    public static void main(String[] args) {
        try {
            // create a lexer that feeds off of input CharStream
            BacktrackLexer lexer = new BacktrackLexer(args[0]);
            // create a buffer of tokens pulled from the lexer
            BacktrackParser parser = new BacktrackParser(lexer);
            parser.stat();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
