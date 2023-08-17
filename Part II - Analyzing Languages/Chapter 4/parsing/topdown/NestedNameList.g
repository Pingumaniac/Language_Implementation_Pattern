grammar NestedNameList ;
list : '[' elements ']' ; // match bracketed list
elements : element (',' element)* ; // match comma-separted list
element : NAME | list ; // element is name or nested list
NAME : ('a'..'z'|'A'..'Z') ; // NAME is sequence of >=1 letter

stat : returnstat | assign | ifstat ; // e.g. "return x+0;" or "x=0" or "if x<0 then x=0;"
returnstat : 'return' expr ';' ; // single-quoted strings are tokens
assign : 'x' '=' expr ;
ifstat : 'if' expr 'then' stat ;

Number : '0'..'9'+ ; // 1 or more digits
ID : ('a'..'z'|'A'..'Z') ; // 1 or more upper or lower case letters
expr : ID '+' Number | ID '<' Number | Number ; // used by resturnstat, if coniditoonal, assign respectively
