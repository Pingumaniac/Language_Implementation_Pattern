package classes;

public interface Scope {
    public String getScopeName();
    public Scope getParentScope();
    public Scope getEnclosingScope();
    public void define(Symbol sym);
    public Symbol resolve(String name);
}
