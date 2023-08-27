grammar Def;

@parser::members {
    SymbolTable symtab;
    Scope currentScope;

    public DefParser(TokenStream input, SymbolTable symtab) {
        super(input);
        this.symtab = symtab;
        this.currentScope = symtab.globals;
    }
}

// Parser Rules
topdown : enterBlock | enterMethod | enterClass | varDeclaration | atoms ;
bottomup : exitBlock | exitMethod | exitClass ;

enterBlock
    :   BLOCK { currentScope = new LocalScope(currentScope); } // push scope
    ;

exitBlock
    :   BLOCK { System.out.println("locals: " + currentScope); currentScope = currentScope.getEnclosingScope(); } // pop scope
    ;

enterClass
    :   'class' ID (EXTENDS ID)?
        {
            System.out.println("line " + $ctx.ID().getSymbol().getLine() + ": def class " + $ctx.ID().getText());
            ClassSymbol cs = new ClassSymbol($ctx.ID().getText(), currentScope, null);
            currentScope.define(cs);
            currentScope = cs;  // set current scope to class scope
        }
    ;

exitClass
    :   'class' { System.out.println("members: " + currentScope); currentScope = currentScope.getEnclosingScope(); }  // pop scope
    ;

enterMethod
    :   METHOD_DECL ID
        {
            System.out.println("line " + $ctx.ID().getSymbol().getLine() + ": def method " + $ctx.ID().getText());
            MethodSymbol ms = new MethodSymbol($ctx.ID().getText(), null, currentScope);
            currentScope.define(ms);
            currentScope = ms;  // set current scope to method scope
        }
    ;

exitMethod
    :   METHOD_DECL { System.out.println("args: " + currentScope); currentScope = currentScope.getEnclosingScope(); } // pop arg scope
    ;

atoms : ('this' | ID) ;

varDeclaration
    :   (FIELD_DECL | VAR_DECL | ARG_DECL) ID
        {
            System.out.println("line " + $ctx.ID().getSymbol().getLine() + ": def " + $ctx.ID().getText());
            VariableSymbol vs = new VariableSymbol($ctx.ID().getText(), null);
            currentScope.define(vs);
        }
    ;

// Lexer Rules
BLOCK       : 'BLOCK';
METHOD_DECL : 'METHOD_DECL';
EXTENDS     : 'extends';
FIELD_DECL  : 'FIELD_DECL';
VAR_DECL    : 'VAR_DECL';
ARG_DECL    : 'ARG_DECL';
ID          : [a-zA-Z]+;
