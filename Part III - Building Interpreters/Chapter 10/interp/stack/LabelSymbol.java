package stack;

import java.util.*;

public class LabelSymbol {
    String name;
    int address;
    boolean isForwardRef = false;
    boolean isDefined = true;
    Vector<Integer> forwardReferences = null;

    public LabelSymbol(String name) { this.name = name; }
    public LabelSymbol(String name, int address) {
        this(name);
        this.address = address;
    }
    public LabelSymbol(String name, int address, boolean forward) {
        this(name);
        isForwardRef = forward;
        if (forward) {
            addForwardReference(address);
        }
        else {
            this.address = address;
        }
    }

    public void addForwardReference(int address) {
        if (forwardReferences == null) {
            forwardReferences = new Vector<Integer>();
        }
        forwardReferences.addElement(address);
    }

    public void resolveForwardReferences(byte[] code) {
        isForwardRef = false;
        Vector<Integer> opndsToPatch = forwardReferences;
        for (int addrToPatch : opndsToPatch) {
            BytecodeAssembler.writeInt(code, addrToPatch, address);
        }
    }

    public String toString() {
        String refs = "";
        if ( forwardReferences!=null ) {
            refs = "[refs="+forwardReferences.toString()+"]";
        }
        return name+"@"+address+refs;
    }
}
