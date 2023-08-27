package classes;

import java.util.LinkedHashMap;
import java.util.Map;

public class MethodSymbol extends Symbol implements Scope {
	Map<String, Symbol> orderedArgs = new LinkedHashMap<String, Symbol>();
    Scope enclosingScope;
    public MethodSymbol(String name, Type retType, Scope enclosingScope) {
        super(name, retType);
        this.enclosingScope = enclosingScope;
    }

    public Symbol resolve(String name) {
        Symbol s = orderedArgs.get(name);
        if (s != null) {
            return s;
        } else if (enclosingScope != null) {
            return enclosingScope.resolve(name);
        } else {
            return null;
        }
	}

	public void define(Symbol sym) {
		orderedArgs.put(sym.name, sym);
		sym.scope = this;
	}

	public Scope getEnclosingScope() { return enclosingScope; }
	public String getScopeName() { return name; }
    public String toString() {
        return "method" + super.toString() + ":" + orderedArgs.values();
    }
}
