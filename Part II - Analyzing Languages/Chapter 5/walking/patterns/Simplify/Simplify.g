grammar Simplify;

prog:	stat+ EOF;
stat:	ID '=' expr   // assignment
    |	'print' expr // print statement
    ;

expr:	multExpr ('+' multExpr)* ;

multExpr: primary (('*' | '.') primary)* ;

primary
    :   INT
    |   ID
    |   '[' expr (',' expr)* ']' // vector
    |   '(' expr ')' // parentheses
    ;

ID  :   'a'..'z'+ ;
INT :   '0'..'9'+ ;
WS  :   (' '|'\r'|'\n')+ -> skip ;
