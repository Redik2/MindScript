package compilers.codeParts.blockControls;

import compilers.codeParts.CodePart;

public class DrawFlush extends CodePart {
    String blockVarName;
    DrawFlush(String blockVarName)
    {
        this.blockVarName = blockVarName;
    }

    @Override
    public String getAsCompiledCode(int previousCPLastLineIndex){
        return String.format("drawflush %s", blockVarName);
    }
}
