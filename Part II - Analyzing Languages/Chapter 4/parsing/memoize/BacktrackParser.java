package memoize;

import java.util.HashMap;
import java.util.Map;

import backtrack.BacktrackLexer;
import lexer.Lexer;

public class BacktrackParser extends Parser {
    private Map<Integer, Integer> list_memo = new HashMap<>();

    public BacktrackParser(Lexer input) { super(input); }
    public void stat() throws Error {
        if ( speculate_stat_alt1() ) {
            list(); match(Lexer.EOF_TYPE);
        }
        else if ( speculate_stat_alt2() ) {
            assign(); match(Lexer.EOF_TYPE);
        }
        else throw new Error("expecting stat found " + LT(1));
    }
    public boolean speculate_stat_alt1() {
        boolean success = true;
        mark(); // mark this spot in input so we can rewind
        try { list(); match(Lexer.EOF_TYPE); }
        catch (Error e) { success = false; }
        release();
        return success;
    }
    public boolean speculate_stat_alt2() {
        boolean success = true;
        mark(); // mark this spot in input so we can rewind
        try { assign(); match(Lexer.EOF_TYPE); }
        catch (Error e) { success = false; }
        release();
        return success;
    }

    // match '[' elements ']'
    public void _list() throws Exception {
        match(BacktrackLexer.LBRACK); elements(); match(BacktrackLexer.RBRACK);
    }
    // list : '[' elements ']' ; // match bracketed list
    public void list() {
        boolean failed = false;
        int startTokenIndex = index();
        if ( isSpeculating() ) {
            try {
                if (alreadyParsedRule(list_memo)) return;
            } catch (Exception e) {
                failed = true; // handle or rethrow if necessary
            }
        }
        try {
            _list();
        } catch (Exception e) {
            failed = true;
            throw new Error("failed to parse list at index " + startTokenIndex);
        } finally {
            if ( isSpeculating() ) {
                memoize(list_memo, startTokenIndex, failed);
            }
        }
    }

    // used from codes for LL(k) Recursive Descent Parser
    void elements() {
        element();
        while (LA(1) == BacktrackLexer.COMMA) {
            match(BacktrackLexer.COMMA);
            element();
        }
    }
    void element() {
        if (LA(1) == BacktrackLexer.NAME && LA(2) == BacktrackLexer.EQUALS) {
            match(BacktrackLexer.NAME); match(BacktrackLexer.EQUALS); match(BacktrackLexer.NAME);
        } else if (LA(1) == BacktrackLexer.NAME) {
            match(BacktrackLexer.NAME);
        } else if (LA(1) == BacktrackLexer.LBRACK) {
            list();
        }
        else {
            throw new Error("expecting name or list; found " + LT(1));
        }
    }
    public void assign() {
        list(); match(BacktrackLexer.EQUALS); list();
    }
}
