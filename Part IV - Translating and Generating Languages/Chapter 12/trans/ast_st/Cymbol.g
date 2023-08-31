grammar Cymbol;

// Parser Rules
compilationUnit : (classDeclaration | methodDeclaration | varDeclaration)+ EOF;

classDeclaration : 'class' ID superClass? '{' classMember+ '}' ';' ;

superClass : ':' ID ;

classMember : varDeclaration | methodDeclaration ;

methodDeclaration : type ID '(' formalParameters? ')' block ;

formalParameters : parameter (',' parameter)* ;

parameter : type ID
          | type ID '[]'
          | type '*' ID
          ;

type : primitiveType | ID ;

primitiveType : 'float' | 'int' | 'char' | 'boolean' | 'void' ;

block : '{' statement* '}' ;

varDeclaration : type ID ('=' expression)? ';'
               | type ID '[]' ('=' expression)? ';'
               | type '*' ID ('=' expression)? ';'
               ;

statement : block
          | varDeclaration
          | 'if' '(' expression ')' statement ('else' statement)?
          | 'return' expression? ';'
          | lhs '=' expression ';'
          | postfixExpression ';'
          ;

lhs : unaryExpression ;

expressionList : expr (',' expr)* ;

expression : expr ;

expr : equalityExpression ;

equalityExpression : relationalExpression (('!=' | '==') relationalExpression)* ;

relationalExpression : additiveExpression (('<' | '>' | '<=' | '>=') additiveExpression)* ;

additiveExpression : multiplicativeExpression (('+' | '-') multiplicativeExpression)* ;

multiplicativeExpression : unaryExpression (('*' | '/') unaryExpression)* ;

unaryExpression : '-' unaryExpression
                | '!' unaryExpression
                | '&' unaryExpression
                | '*' unaryExpression
                | postfixExpression
                ;

postfixExpression : (primary) (('(' expressionList ')' | '[' expr ']' | '.' ID | '->' ID) )* ;

primary : ID | INT | FLOAT | CHAR | 'true' | 'false' | '(' expr ')' ;

// Lexer Rules

ID : LETTER (LETTER | '0'..'9')* ;

fragment LETTER : [a-zA-Z] ;

CHAR : '\'' . '\'' ;

INT : [0-9]+ ;

FLOAT : INT '.' [0-9]* | '.' [0-9]+ ;

WS : [ \r\t\n] -> channel(HIDDEN) ;

SL_COMMENT : '//' ~[\r\n]* '\r'? '\n' -> channel(HIDDEN) ;
