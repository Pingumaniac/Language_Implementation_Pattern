grammar Types;

options {
  superClass = SymbolTable;
}

@members {
  SymbolTable symtab;
  Type evalType;
  public Types(CharStream input, SymbolTable symtab) {
    this(input);
    this.symtab = symtab;
  }
}

bottomup
  : exprRoot
  | decl
  | ret
  | assignment
  | ifstat
  ;

ifstat
  : 'if' cond=expr s=stat e=stat? { symtab.ifstat($cond.type); }
  ;


decl
  : VAR_DECL ID (init=expr)? { if ($init.type != null) symtab.declinit($ID, $init.type); }
  ;

ret
  : 'return' v=expr { symtab.ret($v.type); }
  ;

assignment
  : '=' lhs=expr rhs=expr { symtab.assign($lhs.type, $rhs.type); }
  ;

exprRoot
  : EXPR expr { evalType = $expr.type; }
  ;

expr returns [Type type]
  : 'true'           { $type = SymbolTable._boolean; }
  | 'false'          { $type = SymbolTable._boolean; }
  | CHAR             { $type = SymbolTable._char; }
  | INT              { $type = SymbolTable._int; }
  | FLOAT            { $type = SymbolTable._float; }
  | ID               { VariableSymbol s = (VariableSymbol) symtab.resolveType($ID.text); $type = s.type; }
  | UNARY_MINUS expr { $type = symtab.uminus($expr.start); }
  | UNARY_NOT expr   { $type = symtab.unot($expr.start); }
  | ADDR expr        { $type = new PointerType($expr.type); }
  | DEREF expr       { $type = symtab.ptrDeref($expr.start); }
  | member           { $type = $member.type; }
  | call             { $type = $call.type; }
  | a=expr bop a=expr { $type = symtab.bop($a.start, $a.start); }  // Handling binary ops
  | a=expr relop a=expr { $type = symtab.relop($a.start, $a.start); } // Handling relational ops
  | a=expr eqop a=expr { $type = symtab.eqop($a.start, $a.start); } // Handling equality ops
  ;

call returns [Type type]
@init { List args = new ArrayList(); }
  : CALL ID ELIST (expr { args.add($expr.start); })* { $type = symtab.call($ID, args); }
  ;

member returns [Type type]
  : '.' expr ID { $type = symtab.member($expr.start, $ID); }
  ;

bop : '+' | '-' | '*' | '/' ;
relop : '<' | '>' | '<=' | '>=' ;
eqop : '!=' | '==' ;
VAR_DECL : 'var';
ID       : [a-zA-Z_][a-zA-Z_0-9]* ;
EXPR     : '=' ; // might actually be better as a parser rule.
CHAR     : '\'' ~'\'' '\'' ;
INT      : [0-9]+ ;
FLOAT    : [0-9]+ '.' [0-9]* | '.' [0-9]+ ;
CALL     : 'call' ; // might actually be better as a parser rule.
ELIST    : 'elist' ; // might actually be better as a parser rule.
UNARY_MINUS : '-' ;
UNARY_NOT   : '!' ;
ADDR        : '&' ;
DEREF       : '*' ;

stat
  : expr SEMI // an expression followed by a semicolon
  | decl SEMI // a declaration followed by a semicolon
  | ret SEMI // a return statement followed by a semicolon
  | ifstat // an if-statement
  ;

SEMI: ';';
