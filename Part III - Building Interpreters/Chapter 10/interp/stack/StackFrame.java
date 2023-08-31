package stack;

public class StackFrame {
    FunctionSymbol sym;
    int returnAddress;
    Object[] locals;
    public StackFrame(FunctionSymbol sym, int returnAddress) {
        this.sym = sym;
        this.returnAddress = returnAddress;
        locals = new Object[sym.nargs+sym.nlocals];
    }
}
