package wiki;

import java.io.FileReader;
import java.io.PrintStream;
import org.antlr.v4.runtime.*;

public class WikiToHTML {
    public static void main(String args[]) throws Exception {
        String wikiFilename = args[0];
        FileReader fr = new FileReader(wikiFilename);
        PrintStream out = System.out;

        header(out);

        CharStream charStream = CharStreams.fromReader(fr);
        Wiki lexer = new Wiki(charStream, out);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Token t = lexer.nextToken();
        while (t.getType() != Token.EOF) {
            t = lexer.nextToken();
        }

        fr.close();

        trailer(out);
    }

    static void header(PrintStream out) {
        out.println(
                "<HTML>\n" +
                        "<HEAD>\n" +
                        "<meta http-equiv=content-type content=\"text/html; charset=utf-8\"/>\n" +
                        "<link rel=stylesheet href=http://www.cs.usfca.edu/~parrt/lecture-wiki.css " +
                        "type=\"text/css\"/>\n" +
                        "</HEAD>\n" +
                        "<BODY>\n");
    }

    static void trailer(PrintStream out) {
        out.println("</BODY>");
        out.println("</HTML>");
    }
}
