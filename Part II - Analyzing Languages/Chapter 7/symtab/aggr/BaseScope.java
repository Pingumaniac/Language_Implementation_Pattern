package aggr;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class BaseScope implements Scope {
    Scope enclosingScope; // null if global (outermost) scope
    Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();
    public BaseScope(Scope enclosingScope) {
        this.enclosingScope = enclosingScope;
    }
    public Symbol resolve(String name) {
        Symbol s = symbols.get(name);
        if (s != null) {
            return s;
        } else if (enclosingScope != null) {
            return enclosingScope.resolve(name);
        } else {
            return null;
        }
    }
    public void define(Symbol sym) {
        symbols.put(sym.name, sym);
        sym.scope = this;
    }
    public Scope getEnclosingScope() { return enclosingScope; }
    public String toString() { return symbols.keySet().toString(); }
}
