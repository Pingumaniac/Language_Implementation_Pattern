package tree;

public class FunctionSpace extends MemorySpace {
    FunctionSymbol def;
    public FunctionSpace(FunctionSymbol func) {
		super(func.name + " invocation");
        this.def = func;
	}
}
