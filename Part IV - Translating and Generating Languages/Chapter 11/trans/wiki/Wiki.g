lexer grammar Wiki;

@header {
    import java.util.*;
    import java.io.*;
}

@members {
    PrintStream out;
    Stack<String> context = new Stack<String>();

    void closeList() {
        if (context.size() == 0) return;
        String list = context.pop();
        out.println("</" + list + ">");
    }

    boolean upcomingEndOfCol() {
        return _input.LA(1) == '|' ||
               (_input.LA(1) == '\n' &&
                (_input.LA(2) == '-' && _input.LA(3) == '-') || _input.LA(2) == ']');
    }

    public Wiki(CharStream input, PrintStream out) {
        this(input);
        this.out = out;
    }
}

TITLE
    :   {getLine() == 1}? TAIL
        { out.println("<title>" + getText() + "</title>"); }
    ;

BOLD
    :   {getCharPositionInLine() > 0}? '*'
        ~'*'+
        '*'
        { out.print("<b>" + getText().substring(1, getText().length()-1) + "</b>"); }
    ;

LINK
    :   '@'
        ~('|' | '@')+
        ( '|' ~'@'+ )?
        '@'
        { /* Insert HTML generation logic here */ }
    ;

ITALICS
    :   '_'
        ~'_'+
        '_'
        { out.print("<i>" + getText().substring(1, getText().length()-1) + "</i>"); }
    ;

LI
    :   {getCharPositionInLine() == 0}? '* '
        { out.print("<li>"); }
    ;

BLANK_LINE
    :   '\n\n'
        { out.println("\n"); closeList(); }
        ( UL | SECTION | TABLE )
    ;

UL
    :   '* '
        { out.print("<ul>\n<li>"); context.push("ul"); }
    ;

SECTION
    :   {getCharPositionInLine() == 0}? ( '###' | '##' | '#' ) ~('\n')+
        {
            String fullText = getText();
            String tag = fullText.substring(0, 1); // You may have to adjust this
            String content = fullText.substring(tag.length());
            if (tag.equals("###")) tag = "h1";
            else if (tag.equals("##")) tag = "h2";
            else if (tag.equals("#")) tag = "h3";
            out.println("<" + tag + ">" + content + "</" + tag + ">");
        }
    ;

TABLE
    :   '[' ROW ('\n--\n' ROW)* '\n' ']'
        { out.print("\n</table>"); }
    ;

ROW
    :   {out.print("<tr>\n");}
        COL ('|' COL)*
        {out.print("\n</tr>\n");}
    ;

COL
    :   {out.print("<td>");}
        TABLE_CONTENT+
        {out.print("</td>");}
    ;

TABLE_CONTENT
    :   TABLE | BOLD | ITALICS
    |   . {out.print((char)_input.LA(1));}
    ;

TAIL    : ~'\n'+ ;

SEC_TAIL: ~('\n'|'#')+ ;

ELSE    : . { out.print((char) _input.LA(1)); } ;
