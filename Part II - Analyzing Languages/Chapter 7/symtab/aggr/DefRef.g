grammar DefRef;

@parser::members {
    SymbolTable symtab = new SymbolTable();
    Scope currentScope;
}

compilationUnit
    :   (block | methodDeclaration | structDeclaration | varDeclaration | assignment)* EOF
    ;

// Handle Blocks
block
    :   '{' { currentScope = new LocalScope(currentScope); }
        (statement)*
        '}' { System.out.println("locals: " + currentScope);
              currentScope = currentScope.getEnclosingScope(); }
    ;

// Define statements
statement
    :   varDeclaration
    |   assignment
    |   block
    ;

// Handle Method Declarations
methodDeclaration
    :   'def' type ID '(' ')' block
        { System.out.println("line " + $ID.getLine() + ": def method " + $ID.getText());
          MethodSymbol ms = new MethodSymbol($ID.getText(), $type.text, currentScope);
          currentScope.define(ms);
          currentScope = ms; }
    ;

// Handle Struct Declarations
structDeclaration
    :   'struct' ID '{' '}'
        { System.out.println("line " + $ID.getLine() + ": def struct " + $ID.getText());
          StructSymbol ss = new StructSymbol($ID.getText(), currentScope);
          currentScope.define(ss);
          currentScope = ss; }
    ;

// Variable Declarations
varDeclaration
    :   type ID ';'
        { System.out.println("line " + $ID.getLine() + ": def " + $ID.getText());
          VariableSymbol vs = new VariableSymbol($ID.getText(), $type.text);
          currentScope.define(vs); }
    ;

type
    :   'float' { $text = "float"; }
    |   'int'  { $text = "int"; }
    |   'void' { $text = "void"; }
    |   ID     { $text = $ID.getText(); }
    ;

// Handle Assignments
assignment
    :   ID '=' expression ';'
        { System.out.println("line " + $ID.getLine() + ": assign to " + $ID.getText()); }
    ;

// Define Expressions (very basic for demonstration)
expression
    :   INT
    |   ID
    ;

INT : [0-9]+;
ID : [a-zA-Z]+;
WS : [ \t\r\n]+ -> skip;
