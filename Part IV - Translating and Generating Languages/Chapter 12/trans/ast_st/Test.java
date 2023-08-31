package ast_st;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.IOException;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws IOException {
        CharStream input = args.length > 0 ? CharStreams.fromPath(Paths.get(args[0])) : CharStreams.fromStream(System.in);
        CymbolLexer lexer = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser parser = new CymbolParser(tokens);
        ParseTree tree = parser.compilationUnit();
        STGroup templates = new STGroupFile("Cymbol.stg");
        ParseTreeWalker walker = new ParseTreeWalker();
        CymbolBaseListener listener = new YourCustomListener(templates);
        walker.walk(listener, tree);
        ST result = listener.getOutput();
        System.out.println(result.render());
    }
}

