grammar Graphics ;

file : command+ ; // a file is a list of commands
command : 'line' 'from' point 'to' point ;
point : INT ',' INT ; // e.g. "0,10"
INT : '0'..'9'+ ; // lexer rule to match 1-or-more digits
WS : (' ' | '\t' | '\n' | '\r') {skip();} ; // lexer rule to skip whitespace
