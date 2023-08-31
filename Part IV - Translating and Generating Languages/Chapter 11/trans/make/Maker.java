package make;

import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Maker {
    public static void main(String args[]) throws Exception {
        String makefileName = args[0];
        CharStream input = CharStreams.fromFileName(makefileName);
        MakeLexer lexer = new MakeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaGenerator gen = new JavaGenerator(makefileName);
        MakeParser parser = new MakeParser(tokens, gen);
        try {
            parser.rules();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
