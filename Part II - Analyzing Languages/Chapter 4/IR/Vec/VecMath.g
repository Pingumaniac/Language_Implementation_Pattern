grammar VecMath;

// Parser Rules
statlist: stat+ ;
stat: ID '=' expr | 'print' expr ;
expr: multExpr ('+' multExpr)* ;
multExpr: primary (('*' | '.') primary)* ;
primary: INT | ID | '[' expr (',' expr)* ']' ;

// Lexer Rules
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
INT: [0-9]+ ;
WS: [ \t\r\n]+ -> skip ; // Skip whitespaces
