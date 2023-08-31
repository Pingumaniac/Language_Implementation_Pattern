package reg;

public class StackFrame {
    FunctionSymbol sym;
    int returnAddress;
    Object[] registers;
    public StackFrame(FunctionSymbol sym, int returnAddress) {
        this.sym = sym;
        this.returnAddress = returnAddress;
        registers = new Object[sym.nargs+sym.nlocals+1];
    }
}
