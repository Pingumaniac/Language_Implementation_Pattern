grammar Assembler;

@header {
    import java.util.*;
}

@members {
    // Define the functionality required by the parser for code generation
    protected void gen(org.antlr.v4.runtime.Token instrToken) {;}
    protected void gen(org.antlr.v4.runtime.Token instrToken, org.antlr.v4.runtime.Token operandToken) {;}
    protected void gen(org.antlr.v4.runtime.Token instrToken, org.antlr.v4.runtime.Token oToken1, org.antlr.v4.runtime.Token oToken2) {;}
    protected void gen(org.antlr.v4.runtime.Token instrToken, org.antlr.v4.runtime.Token oToken1, org.antlr.v4.runtime.Token oToken2, org.antlr.v4.runtime.Token oToken3) {;}
    protected void checkForUnresolvedReferences() {;}
    protected void defineFunction(org.antlr.v4.runtime.Token idToken, int nargs, int nlocals) {;}
    protected void defineDataSize(int n) {;}
    protected void defineLabel(org.antlr.v4.runtime.Token idToken) {;}
}

program
    :   globals?
        ( functionDeclaration | instr | label | NEWLINE )+
        { checkForUnresolvedReferences(); }
    ;

globals
    :   NEWLINE* '.globals' INT NEWLINE
        { defineDataSize(Integer.parseInt($INT().getText())); }
    ;

functionDeclaration
    :   '.def' name=ID ':' 'args' '=' a=INT ',' 'locals' '=' lo=INT NEWLINE
        { defineFunction($name, Integer.parseInt($a.text), Integer.parseInt($lo.text)); }
    ;

instr
    :   ID NEWLINE
        { gen($ID); }
    |   ID operand NEWLINE
        { gen($ID, $operand.start); }
    |   ID a=operand ',' b=operand NEWLINE
        { gen($ID, $a.start, $b.start); }
    |   ID a=operand ',' b=operand ',' c=operand NEWLINE
        { gen($ID, $a.start, $b.start, $c.start); }
    ;

operand :   ID | REG | FUNC | INT | CHAR | STRING | FLOAT ;
label   :   ID ':' { defineLabel($ID); } ;
REG     :   'r' INT ;
ID      :   LETTER ( LETTER | '0'..'9' )* ;
FUNC    :   ID '()' ;
LETTER  :   [a-zA-Z] ;
INT     :   '-'? '0'..'9'+ ;
CHAR    :   '\'' . '\'' ;
STRING  :   '"' ~["\r\n]* '"' ;
FLOAT   :   INT '.' INT* | '.' INT+ ;
WS      :   [ \t]+ -> skip ;
NEWLINE :   (';' ~[\r\n]*)? '\r'? '\n' -> skip ;
