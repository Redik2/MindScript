package compilers.codeParts.inputOutput;

import compilers.codeParts.CodePart;

public class Read  extends CodePart {
    String index;
    String blockVarName;
    String var;
    Read(String blockVarName, String index, String var)
    {
        this.index = index;
        this.var = var;
        this.blockVarName = blockVarName;
    }

    @Override
    public String getAsCompiledCode(int previousCPLastLineIndex){
        return String.format("read %s %s %s", var, blockVarName, index);
    }
}
