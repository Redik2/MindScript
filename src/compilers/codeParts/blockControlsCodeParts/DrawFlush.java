package compilers.codeParts.blockControlsCodeParts;

import compilers.codeParts.CodePart;

public class DrawFlush extends CodePart {
    String blockVarName;
    DrawFlush(String blockVarName)
    {
        super(1);
        this.blockVarName = blockVarName;
    }

    public String getAsCompiledCode(){
        return String.format("drawflush %s", blockVarName);
    }
}
