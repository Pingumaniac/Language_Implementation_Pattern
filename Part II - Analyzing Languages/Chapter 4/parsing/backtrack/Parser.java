package backtrack;

import lexer.Lexer;
import lexer.Token;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    Lexer input;
    List<Integer> markers;
    List<Token> lookahead;
    int p = 0;

    public Parser(Lexer input) {
        this.input = input;
        this.lookahead = new ArrayList<>();
        this.markers = new ArrayList<>();
    }
    public Token LT(int i) { sync(i); return lookahead.get(p+i-1); }
    public int LA(int i) { return LT(i).type; }
    public void match(int x) throws Error {
        if ( LA(1) == x ) consume();
        else throw new Error("expecting " + input.getTokenName(x) + "; found " + LT(1));
    }
    public void sync(int i) {
        if ( p+i-1 > (lookahead.size()-1) ) {
            int n = (p+i-1) - (lookahead.size()-1);
            fill(n);
        }
    }
    public void fill(int n) {
        for (int i=1; i<=n; i++) lookahead.add(input.nextToken());
    }
    public void consume() {
        p++;
        if ( p == lookahead.size() && !isSpeculating() ) {
            p = 0;
            lookahead.clear();
        }
        sync(1);
    }
    public void mark() { markers.add(p); }
    public void release() {
        int marker = markers.get(markers.size()-1);
        markers.remove(markers.size()-1);
        seek(marker);
    }
    public void seek(int index) { p = index; }
    public boolean isSpeculating() { return markers.size() > 0; }
}
