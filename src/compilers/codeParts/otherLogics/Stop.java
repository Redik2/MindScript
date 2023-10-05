package compilers.codeParts.otherLogics;

import compilers.codeParts.CodePart;

public class Stop  extends CodePart {
    Stop(){

    }

    @Override
    public String getAsCompiledCode(int previousCPLastLineIndex){
        return "stop";
    }
}
