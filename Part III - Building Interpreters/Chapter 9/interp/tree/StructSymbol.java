package tree;

import java.util.Map;
import java.util.LinkedHashMap;

public class StructSymbol extends ScopedSymbol implements Scope {
    Map<String, Symbol> fields = new LinkedHashMap<String, Symbol>();
    public StructSymbol(String name,Scope parent) {super(name, parent);}
    public Symbol resolveMember(String name) { return fields.get(name); }
    public Map<String, Symbol> getMembers() { return fields; }
    public String toString() {
        return "struct "+name+":{"+fields.keySet().toString()+"}";
    }
}
