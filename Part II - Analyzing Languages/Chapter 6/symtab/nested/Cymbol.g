grammar Cymbol;

// Parser Rules

compilationUnit :   (methodDeclaration | varDeclaration)+ EOF ;
methodDeclaration :   type ID '(' formalParameters? ')' block ;
formalParameters :   type ID (',' type ID)* ;
type :   'float' | 'int' | 'void' ;
block :   '{' statement* '}' ;
varDeclaration :   type ID ('=' expression)? ';'  ;
statement
    :   block
    |   varDeclaration
    |   'return' expression? ';'
    |   postfixExpression ('=' expression)? ';'
    ;
expressionList :   expression (',' expression)* ;
expression :   addExpression ;
addExpression :	postfixExpression ('+' postfixExpression)*  ;
postfixExpression :   primary ('(' expressionList ')')*  ;
primary : ID  | INT | '(' expression ')' ;

// Lexer Rules

ID  :   [a-zA-Z] [a-zA-Z0-9]* ;
INT :   [0-9]+ ;
WS  :   [ \r\t\n]+ -> skip ;
SL_COMMENT :   '//' ~[\r\n]* '\r'? '\n' -> skip ;
