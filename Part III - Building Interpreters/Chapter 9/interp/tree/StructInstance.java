package tree;

public class StructInstance extends MemorySpace {
    StructSymbol def;

    public StructInstance(StructSymbol struct) {
		super(struct.name+" instance");
        this.def = struct;
	}

    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("{");
        boolean first = true;
        for (String fieldName : def.fields.keySet()) {
            Object v = members.get(fieldName);
            if ( !first ) buf.append(", ");
            else first = false;
            buf.append(fieldName);
            buf.append('=');
            buf.append(v);
        }
        buf.append("}");
        return buf.toString();
    }
}
