package compilers.codeParts.blockControls;

import compilers.codeParts.CodePart;

public class PrintFlush  extends CodePart {
    String blockVarName;
    PrintFlush(String blockVarName)
    {
        this.blockVarName = blockVarName;
    }

    @Override
    public String getAsCompiledCode(int previousCPLastLineIndex){
        return String.format("printflush %s", blockVarName);
    }
}
