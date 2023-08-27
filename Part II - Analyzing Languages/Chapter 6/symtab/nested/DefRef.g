grammar DefRef;

import Cymbol;

@members {
    SymbolTable symtab;
    Scope currentScope;
    // Initialize symtab and currentScope as needed
}

// Custom Semantic Actions for existing rules

methodDeclaration
    :   type ID '(' formalParameters? ')' block
    {
        System.out.println("line " + $ID.getLine() + ": def method " + $ID.text);
        // Define your method symbol and scope logic here
    }
    ;

block
    :   '{' {currentScope = new LocalScope(currentScope);}
        statement*
        '}' {
            System.out.println("locals: " + currentScope);
            currentScope = currentScope.getEnclosingScope();
        }
    ;

varDeclaration
    :   type ID ('=' expression)? ';'
    {
        System.out.println("line " + $ID.getLine() + ": def " + $ID.text);
        // Define your variable symbol and scope logic here
    }
    ;

expression
    :   primary ('=' expression)?
    {
        // Add scope resolution logic here for IDs involved in assignment
    }
    ;

primary
    :   ID
    {
        // Add scope resolution logic here for IDs used in expressions
    }
    |   INT
    |   '(' expression ')'
    ;

// Lexer Rules are inherited from Cymbol
