package oo;

public class PointerType extends Symbol implements Type {
	Type targetType;

    public PointerType(Type targetType) {
        super(targetType+"*");
        this.targetType = targetType;
    }

    public int getTypeIndex() { return SymbolTable.tPTR; }

    public boolean canAssignTo(Type destType) {
        if (!(destType instanceof PointerType)) return false;
        Type destTargetType = ((PointerType)destType).targetType;
        Type srcTargetType = this.targetType;
        if ( destTargetType instanceof ClassSymbol && this.targetType instanceof ClassSymbol ) {
            ClassSymbol thisClass   = (ClassSymbol)srcTargetType;
            ClassSymbol targetClass = (ClassSymbol)destTargetType;
            return thisClass.isInstanceof(targetClass);
        }
        return srcTargetType == destTargetType;
    }
}
