grammar Printer;

// Rewritten in ANTLRv4 style

prog: stat+ ;
stat: assign | printStat ;
assign: '=' ID expr ;
printStat: 'print' expr ;
expr: expr '+' expr # add
    | expr '*' expr # mult
    | expr '.' expr # dot
    | VEC           # vec
    | INT           # int
    | ID            # id
    ;

VEC: 'VEC';
ID: [a-zA-Z]+;
INT: [0-9]+;
WS: [ \t\n\r]+ -> skip;
