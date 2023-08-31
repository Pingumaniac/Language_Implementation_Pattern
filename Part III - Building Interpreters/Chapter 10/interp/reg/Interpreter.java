package reg;

import org.antlr.v4.runtime.*;
import java.io.InputStream;
import java.io.FileInputStream;

public class Interpreter {
    public static final int DEFAULT_OPERAND_STACK_SIZE = 100;
    public static final int DEFAULT_CALL_STACK_SIZE = 1000;

    DisAssembler disasm;
    int ip;
    byte[] code;
    int codeSize;
    Object[] globals;
    protected Object[] constPool;
    Object[] operands = new Object[DEFAULT_OPERAND_STACK_SIZE];
    int sp = -1;
    StackFrame[] calls = new StackFrame[DEFAULT_CALL_STACK_SIZE];
    int fp = -1;
    FunctionSymbol mainFunction;
    boolean trace = false;

    public static void main(String[] args) throws Exception {
        boolean trace = false;
        boolean disassemble = false;
        boolean dump = false;
        String filename = null;
        int i = 0;
        while (i < args.length) {
            if (args[i].equals("-trace")) {
                trace = true;
                i++;
            } else if (args[i].equals("-dis")) {
                disassemble = true;
                i++;
            } else if (args[i].equals("-dump")) {
                dump = true;
                i++;
            } else {
                filename = args[i];
                i++;
            }
        }

        InputStream input = null;
        if (filename != null)
            input = new FileInputStream(filename);
        else
            input = System.in;

        Interpreter interpreter = new Interpreter();
        load(interpreter, input);
        interpreter.trace = trace;
        interpreter.exec();
        if (disassemble)
            interpreter.disassemble();
        if (dump)
            interpreter.coredump();
    }

    public static boolean load(Interpreter interp, InputStream input) throws Exception {
        boolean hasErrors = false;
        try {
            CharStream charStream = CharStreams.fromStream(input);
            AssemblerLexer assemblerLexer = new AssemblerLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(assemblerLexer);
            BytecodeAssembler assembler = new BytecodeAssembler(tokens);
            assembler.program();
            interp.code = assembler.getMachineCode();
            interp.codeSize = assembler.getCodeMemorySize();
            interp.constPool = assembler.getConstantPool();
            interp.mainFunction = assembler.getMainFunction();
            interp.globals = new Object[assembler.getDataSize()];
            interp.disasm = new DisAssembler(interp.code, interp.codeSize, interp.constPool);
            hasErrors = assembler.getNumberOfSyntaxErrors() > 0;
        } finally {
            input.close();
        }
        return hasErrors;
    }

    public void exec() throws Exception {
        if (mainFunction == null) {
            mainFunction = new FunctionSymbol("main", 0, 0, 0);
        }
        StackFrame f = new StackFrame(mainFunction, -1);
        calls[++fp] = f;
        ip = mainFunction.address;
        cpu();
    }

    protected void cpu() {
        int i = 0, j = 0, k = 0, addr = 0, fieldIndex = 0;
        short opcode = code[ip];
        while (opcode !=  BytecodeDefinition.INSTR_HALT && ip < codeSize) {
            if (trace) trace();
            ip++;
            Object r[] = calls[fp].registers;
            switch (opcode) {
                case BytecodeDefinition.INSTR_IADD :
                    i = getRegOperand();
                    j = getRegOperand();
                    k = getRegOperand();
                    r[k] = ((Integer)r[i])+((Integer)r[j]);
                    break;
                // ...
                case BytecodeDefinition.INSTR_ISUB :
                    i = getRegOperand();
                    j = getRegOperand();
                    k = getRegOperand();
                    r[k] = ((Integer)r[i])-((Integer)r[j]);
                    break;
                case BytecodeDefinition.INSTR_IMUL :
                    i = getRegOperand();
                    j = getRegOperand();
                    k = getRegOperand();
                    r[k] = ((Integer)r[i])*((Integer)r[j]);
                    break;
                case BytecodeDefinition.INSTR_ILT :
                    i = getRegOperand();
                    j = getRegOperand();
                    k = getRegOperand();
                    r[k] = ((Integer)r[i]).intValue()<((Integer)r[j]).intValue();
                    break;
                case BytecodeDefinition.INSTR_IEQ :
                    i = getRegOperand();
                    j = getRegOperand();
                    k = getRegOperand();
                    r[k] = ((Integer)r[i]).intValue()==((Integer)r[j]).intValue();
                    break;
                case BytecodeDefinition.INSTR_FADD :
                    i = getRegOperand();
                    j = getRegOperand();
                    k = getRegOperand();
                    r[k] = ((Float)r[i])+((Float)r[j]);
                    break;
                case BytecodeDefinition.INSTR_FSUB :
                    i = getRegOperand();
                    j = getRegOperand();
                    k = getRegOperand();
                    r[k] = ((Float)r[i])-((Float)r[j]);
                    break;
                case BytecodeDefinition.INSTR_FMUL :
                    i = getRegOperand();
                    j = getRegOperand();
                    k = getRegOperand();
                    r[k] = ((Float)r[i])*((Float)r[j]);
                    break;
                case BytecodeDefinition.INSTR_FLT :
                    i = getRegOperand();
                    j = getRegOperand();
                    k = getRegOperand();
                    r[k] = ((Float)r[i]).floatValue()<((Float)r[j]).floatValue();
                    break;
                case BytecodeDefinition.INSTR_FEQ :
                    i = getRegOperand();
                    j = getRegOperand();
                    k = getRegOperand();
                    r[k] = ((Float)r[i]).intValue()==((Float)r[j]).intValue();
                    break;
                case BytecodeDefinition.INSTR_ITOF :
                    i = getRegOperand();
                    j = getRegOperand();
                    r[j] = (float) (((Integer)r[i]).intValue());
                    break;
                case BytecodeDefinition.INSTR_CALL :
                    int funcStringIndex = getIntOperand();
                    int baseRegisterIndex = getRegOperand();
                    call(funcStringIndex, baseRegisterIndex);
                    break;
                case BytecodeDefinition.INSTR_RET :
                    StackFrame f = calls[fp--]; // pop stack frame
                    calls[fp].registers[0] = f.registers[0];
                    ip = f.returnAddress;
                    break;
                case BytecodeDefinition.INSTR_BR :
                    ip = getIntOperand();
                    break;
                case BytecodeDefinition.INSTR_BRT:
                    i = getRegOperand();
                    addr = getIntOperand();
                    Boolean bv = (Boolean)r[i];
                    if ( bv ) ip = addr;
                    break;
                case BytecodeDefinition.INSTR_BRF:
                    i = getRegOperand();
                    addr = getIntOperand();
                    Boolean bv2 = (Boolean)r[i];
                    if ( !bv2 ) ip = addr;
                    break;
                case BytecodeDefinition.INSTR_CCONST:
                    i = getRegOperand();
                    r[i] = (char)getIntOperand();
                    break;
                case BytecodeDefinition.INSTR_ICONST:
                    i = getRegOperand();
                    r[i] = getIntOperand();
                    break;
                case BytecodeDefinition.INSTR_FCONST:
                case BytecodeDefinition.INSTR_SCONST:
                    i = getRegOperand();
                    int constIndex = getIntOperand();
                    r[i] = constPool[constIndex];
                    break;
                case BytecodeDefinition.INSTR_GLOAD:
                    i = getRegOperand();
                    addr = getIntOperand();
                    r[i] = globals[addr];
                    break;
                case BytecodeDefinition.INSTR_GSTORE:
                    i = getRegOperand();
                    addr = getIntOperand();
                    globals[addr] = r[i];
                    break;
                case BytecodeDefinition.INSTR_FLOAD:
                    i = getRegOperand();
                    j = getRegOperand();
                    fieldIndex = getRegOperand();
                    r[i] = ((StructSpace)r[j]).fields[fieldIndex];
                    break;
                case BytecodeDefinition.INSTR_FSTORE:
                    i = getRegOperand();
                    j = getRegOperand();
                    fieldIndex = getRegOperand();
                    ((StructSpace)r[j]).fields[fieldIndex] = r[i];
                    break;
                case BytecodeDefinition.INSTR_MOVE :
                    i = getRegOperand();
                    j = getRegOperand();
                    r[j] = r[i];
                    break;
                case BytecodeDefinition.INSTR_PRINT :
                    i = getRegOperand();
                    System.out.println(r[i]);
                    break;
                case BytecodeDefinition.INSTR_STRUCT :
                    i = getRegOperand();
                    int nfields = getIntOperand();
                    r[i] = new StructSpace(nfields);
                    break;
                case BytecodeDefinition.INSTR_NULL :
                    i = getRegOperand();
                    r[i] = null;
                    break;
                default :
                    throw new Error("invalid opcode: "+opcode+" at ip="+(ip-1));
            }
            opcode = code[ip];
        }
    }

    protected void call(int functionConstPoolIndex) {
        FunctionSymbol fs = (FunctionSymbol) constPool[functionConstPoolIndex];
        StackFrame f = new StackFrame(fs, ip);
        calls[++fp] = f;
        for (int a = fs.nargs - 1; a >= 0; a--) {
            f.locals[a] = operands[sp--];
        }
        ip = fs.address;
    }

    protected int getIntOperand() {
        int word = BytecodeAssembler.getInt(code, ip);
        ip += 4;
        return word;
    }

    public void disassemble() {
        disasm.disassemble();
    }

    protected void trace() {
        disasm.disassembleInstruction(ip);
        System.out.print("\tstack=[");
        for (int i = 0; i <= sp; i++) {
            Object o = operands[i];
            System.out.print(" " + o);
        }
        System.out.print(" ]");
        if (fp >= 0) {
            System.out.print(", calls=[");
            for (int i = 0; i <= fp; i++) {
                System.out.print(" " + calls[i].sym.name);
            }
            System.out.print(" ]");
        }
        System.out.println();
    }

    public void coredump() {
        if (constPool.length > 0)
            dumpConstantPool();
        if (globals.length > 0)
            dumpDataMemory();
        dumpCodeMemory();
    }

    protected void dumpConstantPool() {
        System.out.println("Constant pool:");
        int addr = 0;
        for (Object o : constPool) {
            if (o instanceof String) {
                System.out.printf("%04d: \"%s\"\n", addr, o);
            } else {
                System.out.printf("%04d: %s\n", addr, o);
            }
            addr++;
        }
        System.out.println();
    }

    protected void dumpDataMemory() {
        System.out.println("Data memory:");
        int addr = 0;
        for (Object o : globals) {
            if (o != null) {
                System.out.printf("%04d: %s <%s>\n",
                        addr, o, o.getClass().getSimpleName());
            } else {
                System.out.printf("%04d: <null>\n", addr);
            }
            addr++;
        }
        System.out.println();
    }

    public void dumpCodeMemory() {
        System.out.println("Code memory:");
        for (int i = 0; code != null && i < codeSize; i++) {
            if (i % 8 == 0 && i != 0)
                System.out.println();
            if (i % 8 == 0)
                System.out.printf("%04d:", i);
            System.out.printf(" %3d", ((int) code[i]));
        }
        System.out.println();
    }
}
