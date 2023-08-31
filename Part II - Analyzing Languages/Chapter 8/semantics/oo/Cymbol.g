grammar Cymbol;

// Parser Rules
compilationUnit
    :   ( classDeclaration | methodDeclaration | varDeclaration )+
    ;

classDeclaration
    :   'class' ID superClass? '{' classMember+ '}' ';'
    ;

superClass
    :   ':' ID
    ;

classMember
    :   varDeclaration
    |   methodDeclaration
    ;

methodDeclaration
    :   type ID '(' formalParameters? ')' block
    ;

formalParameters
    :   parameter (',' parameter)*
    ;

parameter
    :   type ID
    |   type ID '[]'
    |   type '*' ID
    ;

type:   primitiveType
    |   ID
    ;

primitiveType
    :   'float'
    |   'int'
    |   'char'
    |   'boolean'
    |   'void'
    ;

block
    :   '{' statement* '}'
    ;

varDeclaration
    :   type ID ('=' expression)? ';'
    |   type ID '[]' ('=' expression)? ';'
    |   type '*' ID ('=' expression)? ';'
    ;

statement
    :   block
    |   varDeclaration
    |   'if' '(' expression ')' statement ('else' statement)?
    |   'return' expression? ';'
    |   lhs '=' expression ';'
    |   postfixExpression ';'
    ;

lhs :   unaryExpression ;

expressionList
    :   expression (',' expression)*
    ;

expression
    :   expr
    ;

expr:   equalityExpression ;

equalityExpression
    :   relationalExpression ( ('!=' | '==') relationalExpression)*
    ;

relationalExpression
    :   additiveExpression ( ('<' | '>' | '<=' | '>=') additiveExpression)*
    ;

additiveExpression
    :   multiplicativeExpression ( ('+' | '-') multiplicativeExpression)*
    ;

multiplicativeExpression
    :   unaryExpression ( ('*' | '/') unaryExpression)*
    ;

unaryExpression
    :   '-' unaryExpression
    |   '!' unaryExpression
    |   '&' unaryExpression
    |   '*' unaryExpression
    |   postfixExpression
    ;

postfixExpression
    :   primary ( '(' expressionList ')' | '[' expression ']' | '.' ID | '->' ID )*
    ;

primary
    :   ID
    |   INT
    |   FLOAT
    |   CHAR
    |   'true'
    |   'false'
    |   '(' expr ')'
    ;

// Lexer Rules
ID  :   [a-zA-Z] [a-zA-Z0-9]* ;
CHAR:   '\'' . '\'' ;
INT :   [0-9]+ ;
FLOAT   :   INT '.' INT* | '.' INT ;
WS  :   [ \r\t\n]+ -> skip ;
SL_COMMENT :   '//' ~[\r\n]* -> skip ;
