package classes;

import java.util.*;

public class ClassSymbol extends ScopedSymbol implements Scope, Type {
    ClassSymbol superClass;
    public Map<String, Symbol> members = new LinkedHashMap<String, Symbol>();

    public ClassSymbol(String name, Scope enclosingScope, ClassSymbol superClass) {
        super(name, enclosingScope);
        this.superClass = superClass;
    }

    public Scope getParentScope() {
        if (superClass == null) {
            return enclosingScope;
        } else {
            return superClass;
        }
    }

    public Symbol resolveMember(String name) {
        Symbol s = members.get(name);
        if (s != null) {
            return s;
        } else if (superClass != null) {
            return superClass.resolveMember(name);
        } else {
            return null;
        }
    }

    public Map<String, Symbol> getMembers() {
        return members;
    }

    public String toString() {
        return "class " + name + ":{" + stripBrackets(members.keySet().toString()) + "}";
    }


}
