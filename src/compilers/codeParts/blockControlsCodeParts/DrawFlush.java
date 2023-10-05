package compilers.codeParts.blockControlsCodeParts;

import compilers.codeParts.CodePart;

public class DrawFlush extends CodePart {
    String blockVarName;
    DrawFlush(String blockVarName)
    {
        this.blockVarName = blockVarName;
        super(1);
    }

    public String getAsCompiledCode(){
        return String.format("drawflush %s", blockVarName);
    }
}
