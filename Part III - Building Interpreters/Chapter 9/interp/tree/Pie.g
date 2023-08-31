grammar Pie;

@members {
    Interpreter interp;
    Scope currentScope;

    public PieParser(TokenStream input, Interpreter interp) {
        super(input);
        this.interp = interp;
        this.currentScope = interp.globalScope;
    }
}

program: ( functionDefinition | statement )+ EOF;

structDefinition
    :   'struct' name=ID '{' // Java action code for defining struct
        vardef (',' vardef)* '}'
        // Java action code for setting back the scope
    ;

functionDefinition
    :   'def' ID '(' (vardef (',' vardef)* )? ')'
        // Java action code for defining function
        slist
        // Java action code for setting back the scope
    ;

slist
    :	':' NL statement+ '.'
	|	statement
	;

statement
	:	structDefinition
	|	qid '=' expr NL
	|	'return' expr NL
	|	'print' expr NL
	|	'if' expr slist ('else' slist)?
	|	'while' expr slist
	|	call NL
	|	NL
	;

call: ID '(' expr (',' expr )* ')' ;
expr: addexpr ( ('==' | '<') addexpr )? ;

addexpr: mulexpr ( ('+' | '-') mulexpr )* ;
mulexpr: atom ( '*' atom )* ;

atom
	:	INT
	|	CHAR
	|	FLOAT
	|	STRING
	|	qid
	|	call
	|	'(' expr ')'
	;

qid :	ID ('.' ID)* ;

vardef:	ID ;

// Lexer rules

NL: '\r'? '\n';
ID: [a-zA-Z] [a-zA-Z0-9]*;
CHAR: '\'' . '\'' ;
STRING: '"' .*? '"' ;
INT: [0-9]+ ;
FLOAT: INT '.' INT* | '.' INT ;
WS: [ \t] -> skip ;
SL_COMMENT: '#' ~[\r\n]* -> skip;
