package compilers.codeParts.otherLogicsCodeParts;

import compilers.codeParts.CodePart;

public class Stop  extends CodePart {
    Stop(){
        super(1);
    }

    public String getAsCompiledCode(){
        return "stop";
    }
}
