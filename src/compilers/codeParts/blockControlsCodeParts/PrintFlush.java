package compilers.codeParts.blockControlsCodeParts;

import compilers.codeParts.CodePart;

public class PrintFlush  extends CodePart {
    String blockVarName;
    PrintFlush(String blockVarName)
    {
        super(1);
        this.blockVarName = blockVarName;
    }

    public String getAsCompiledCode(){
        return String.format("printflush %s", blockVarName);
    }
}
