package Builder.MathData;
public class MathDataBuilder {
    
    private int varA;
    private int varB;
    private int varC;
    private int varD;


    public MathDataBuilder withVarA(int varA) {
        this.varA = varA;
        return this;
    }
    public MathDataBuilder withVarB(int varB) {
        this.varB = varB;
        return this;
    }
    public MathDataBuilder withVarC(int varC) {
        this.varC = varC;
        return this;
    }
    public MathDataBuilder withVarD(int varD) {
        this.varD = varD;
        return this;
    }

    public MathData build(){
        return new MathData(varA,varB,varC,varD);
    }
    
}
