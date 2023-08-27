package aggr;

import java.util.Map;
import java.util.LinkedHashMap;

public class StructSymbol extends ScopedSymbol implements Type, Scope {
    Map<String, Symbol> fields = new LinkedHashMap<String, Symbol>();
    public StructSymbol(String name,Scope parent) {super(name, parent);}
    // For a.b, only look in fields to resolve b, not up scope tree
    public Symbol resolveMember(String name) { return fields.get(name); }
    public Map<String, Symbol> getMembers() { return fields; }
    public String toString() {
        return "struct " + name + ":{" + stripBrackets(fields.keySet().toString()) + "}";
    }
    public static String stripBrackets(String s) {
        return s.substring(1,s.length()-1);
    }
}
