public class Test {
    public static void main(String[] args) throws Exception {
        CharStream inut = null;
        if (args.length > 0) input = new ANTLRFileStream(args[0]);
        else input = new ANTLRInputStream(System.in);
        GraphicsLexer lex = new GraphicsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        GraphicsParser p = new GraphicsParser(tokens);
        p.file();
    }
}
