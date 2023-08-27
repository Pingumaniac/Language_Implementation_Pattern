grammar Ref;

@parser::members {
    SymbolTable symtab;
    public RefParser(TokenStream input, SymbolTable symtab) {
        super(input);
        this.symtab = symtab;
    }
}

topdown : enterMethod | enterClass | varDeclaration | assignment | resolveExpr ;

enterClass
    :   'class' ID EXTENDS? ID? MEMBERS {
            if ($EXTENDS != null) {
                Symbol sup = symtab.resolve($EXTENDS.text);
                ClassSymbol current = (ClassSymbol) symtab.resolve($ID.text);
                current.superClass = (ClassSymbol) sup;
                System.out.println("line " + $ID.getLine() + ": set " + $ID.text + " super to " + current.superClass.name);
            }
            else {
                System.out.println("line " + $ID.getLine() + ": set " + $ID.text);
            }
        }
    ;

enterMethod
    :   METHOD_DECL type ID {
            Symbol s = symtab.resolve($ID.text);
            s.type = symtab.resolve($type.text);
            System.out.println("line " + $ID.getLine() + ": set method type " + s);
        }
    ;

varDeclaration
    :   (FIELD_DECL | VAR_DECL | ARG_DECL) type ID {
            Symbol s = symtab.resolve($ID.text);
            s.type = symtab.resolve($type.text);
            System.out.println("line " + $ID.getLine() + ": set var type " + s);
        }
    ;

type : 'float' | 'int' | 'void' | ID ;
assignment : '=' expr expr ;
resolveExpr : EXPR expr ;
expr : member | CALL expr | '+' expr expr | id | INT ;

id
    :   ID {
            Symbol s = symtab.resolve($ID.text);
            if (s != null) {
                // Insert code for type checking or other actions here.
            }
        }
    |   'this' {
            // Insert code for 'this' resolution here, for example:
            ClassSymbol currentClass = symtab.getEnclosingClass();
            // Continue with other code...
        }
    ;

member
    :   '.' expr ID {
            ClassSymbol scope = (ClassSymbol) symtab.resolve($expr.text);
            Symbol s = scope.resolveMember($ID.text);
            System.out.println("line " + $ID.getLine() + ": resolve " + $expr.text + "." + $ID.text + " to " + s);
        }
    ;

// Lexer rules
EXTENDS     : 'extends';
MEMBERS     : 'members';
METHOD_DECL : 'method_decl';
FIELD_DECL  : 'field_decl';
VAR_DECL    : 'var_decl';
ARG_DECL    : 'arg_decl';
CALL        : 'call';
EXPR        : 'expr';
ID          : [a-zA-Z]+;
INT         : [0-9]+;
