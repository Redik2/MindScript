package compilers.codeParts.blockControls;

import compilers.codeParts.CodePart;

public class GetLink  extends CodePart {
    String returnVarName;
    String blockIndex;
    GetLink(String blockIndex, String returnVarName)
    {
        this.blockIndex = blockIndex;
        this.returnVarName = returnVarName;
    }

    @Override
    public String getAsCompiledCode(int previousCPLastLineIndex){
        return String.format("getlink %s %s", returnVarName, blockIndex);
    }
}
