package safety;

public interface Type {
    public String getName();
    public int getTypeIndex();
    public boolean canAssignTo(Type destType);
}
