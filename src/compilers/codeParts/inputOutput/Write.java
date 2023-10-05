package compilers.codeParts.inputOutput;

import compilers.codeParts.CodePart;

public class Write  extends CodePart {
    String index;
    String blockVarName;
    String var;
    Write(String blockVarName, String index, String var)
    {
        super(1);
        this.index = index;
        this.var = var;
        this.blockVarName = blockVarName;
    }

    public String getAsCompiledCode(){
        return String.format("write %s %s %s", var, blockVarName, index);
    }
}
