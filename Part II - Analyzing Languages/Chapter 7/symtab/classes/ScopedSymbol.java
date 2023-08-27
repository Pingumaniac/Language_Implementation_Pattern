package classes;

import java.util.Map;

public abstract class ScopedSymbol extends Symbol implements Scope {
    Scope enclosingScope;

    public ScopedSymbol(String name, Type type, Scope enclosingScope) {
        super(name, type);
        this.enclosingScope = enclosingScope;
    }

    public ScopedSymbol(String name, Scope enclosingScope) {
        super(name);
        this.enclosingScope = enclosingScope;
    }

    public Symbol resolve(String name) {
		Symbol s = getMembers().get(name);
        if ( s!=null ) {
            return s;
        } else if ( getEnclosingScope() != null ) {
			return getEnclosingScope().resolve(name);
		} else {
            return null;
        }
	}

    public Symbol resolveType(String name) {
        return resolve(name);
    }

    public void define(Symbol sym) {
        getMembers().put(sym.name, sym);
        sym.scope = this;
    }
    public Scope getEnclosingScope() { return enclosingScope; }
    public String getScopeName() { return name; }
    public Scope getParentScope() {
        return getEnclosingScope();
    }

    // Indicate how subclasses store scope members.
    // Allows us to factor out common code in this class.
    public abstract Map<String, Symbol> getMembers();
}
