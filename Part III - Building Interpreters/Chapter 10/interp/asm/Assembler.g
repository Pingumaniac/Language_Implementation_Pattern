grammar Assembler;

@parser::members {
    protected void gen(Token instrToken) {;}
    protected void gen(Token instrToken, Token operandToken) {;}
    protected void gen(Token instrToken, Token oToken1, Token oToken2) {;}
    protected void gen(Token instrToken, Token oToken1, Token oToken2, Token oToken3) {;}
    protected void checkForUnresolvedReferences() {;}
    protected void defineFunction(Token idToken, int nargs, int nlocals) {;}
    protected void defineDataSize(int n) {;}
    protected void defineLabel(Token idToken) {;}
}

program
    :   globals?
        ( functionDeclaration | instr | label | NEWLINE )+
        { checkForUnresolvedReferences(); }
    ;

globals : NEWLINE* '.globals' INT NEWLINE { defineDataSize((INT!=null?Integer.parseInt(INT.getText()):0)); } ;

functionDeclaration
    : '.def' name=ID ':' 'args' '=' a=INT ',' 'locals' '=' n=INT NEWLINE
      { defineFunction($name, (a!=null?Integer.parseInt(a.getText()):0), (n!=null?Integer.parseInt(n.getText()):0)); }
    ;

instr
    :   ID NEWLINE                         { gen(ID); }
    |   ID operand NEWLINE                 { gen(ID, operand.start); }
    |   ID a=operand ',' b=operand NEWLINE { gen(ID, a.start, b.start); }
    |   ID a=operand ',' b=operand ',' c=operand NEWLINE
        { gen(ID, a.start, b.start, c.start); }
    ;

operand : ID | REG | FUNC | INT | CHAR | STRING | FLOAT ;
label : ID ':' { defineLabel(ID); } ;
REG : 'r' INT ;
ID  : LETTER ( LETTER | '0'..'9' )* ;
FUNC: ID '()' { setText(ID.getText()); } ;
LETTER : [a-zA-Z] ;
INT : '-'? '0'..'9'+ ;
CHAR : '\'' . '\'' ;
STRING: '"' ~["\r\n]* '"' ;
FLOAT : INT '.' INT* | '.' INT+ ;
WS : [ \t]+ -> skip ;
NEWLINE : (';' ~[\r\n]*)? '\r'? '\n' -> skip ;
