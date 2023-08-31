grammar Make;

@members {
    MakeGenerator gen;
    public MakeParser(TokenStream input, MakeGenerator gen) {
        super(input);
        this.gen = gen;
    }
}

// Top-level rule
rules
    :   {gen.start();} rule+ {gen.finish();}
    ;

// A Makefile rule
rule
    :   ITEM ':' {gen.target(getCurrentToken().getText());}
        (ITEM {gen.dependency(getCurrentToken().getText());})* '\n'
        (ACTION {gen.action(getCurrentToken().getText());})+
        {gen.endTarget(getCurrentToken().getText());}
    |   '\n' // ignore blank lines
    ;

// Tokens
ITEM    :   ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'.'|'-'|'/')+ ;
ACTION  :   (' '|'\t') ~'\n'+ '\n' ;
COMMENT :   '#' ~('\n'|'\r')* '\r'? '\n' -> channel(HIDDEN) ;
WS      :   (' '|'\t')+ -> channel(HIDDEN) ;
