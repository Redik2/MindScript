package compilers.codeParts.blockControlsCodeParts;

import compilers.codeParts.CodePart;

public class GetLink  extends CodePart {
    String returnVarName;
    String blockIndex;
    GetLink(String blockIndex, String returnVarName)
    {
        this.blockIndex = blockIndex;
        this.returnVarName = returnVarName;
    }
    public String getAsCompiledCode(){
        return String.format("getlink %s %s", returnVarName, blockIndex);
    }
}
