package types;

import org.antlr.v4.runtime.tree.ParseTree;
import lexer.Token;

public class CymbolAST extends ParseTree {
    public Scope scope;   // set by Def.g; ID lives in which scope?
    public Symbol symbol; // set by Ref.g; point at def in symbol table
    public Type evalType;
    public Type promoteToType;

    public CymbolAST() { }
    public CymbolAST(Token t) { super(t); }

    public String toString() {
        String s = super.toString();
        if (evalType !=null) {
            String annot = evalType.getName();
            if (promoteToType !=null) {
                annot += ":" + promoteToType.getName();
            }
            return s + '<' + annot + '>';
        }
        return s;
    }
}
