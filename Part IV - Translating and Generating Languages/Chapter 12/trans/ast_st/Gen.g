grammar Gen;

// Parser rules

compilationUnit: (
		classDeclaration
		| methodDeclaration
		| varDeclaration
	)+;

classDeclaration: 'class' ID (':' ID)? '{' classMember+ '}';

classMember: varDeclaration | methodDeclaration;

methodDeclaration: 'method' type ID '(' parameter* ')' block;

parameter: ('*' type | type) ID;

type: primitiveType | ID;

primitiveType: 'float' | 'int' | 'char' | 'boolean' | 'void';

block: '{' statement* '}';

varDeclaration:
	'var' ('*' type | type) ID ('=' expression)? ';';

statement:
	block
	| varDeclaration
	| 'if' '(' expression ')' statement ('else' statement)?
	| 'return' expression? ';'
	| expression '=' expression ';'
	| 'call' ID '(' expressionList ')' ';';

expression:
	atom								# atomExpr
	| '-' expression					# unaryMinusExpr
	| '!' expression					# unaryNotExpr
	| '&' expression					# addrExpr
	| '*' ID '+' expression				# indexExpr
	| '*' expression					# derefExpr
	| expression '.' ID					# memberExpr
	| 'call' ID '(' expressionList ')'	# callExpr
	| expression bop expression			# binaryOperation
	| expression relop expression		# relationalOperation
	| expression eqop expression		# equalityOperation;

expressionList: expression (',' expression)*;

bop: '+' | '-' | '*' | '/';

relop: '<' | '>' | '<=' | '>=';

eqop: '!=' | '==';

atom: 'true' | 'false' | CHAR | INT | FLOAT | ID;

CHAR: '\'' ~['\r\n\f\\'] '\'';
INT: [0-9]+;
FLOAT: [0-9]* '.' [0-9]+;
ID: [a-zA-Z_] [a-zA-Z_0-9]*;

WS: [ \t\r\n]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
