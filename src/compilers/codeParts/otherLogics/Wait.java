package compilers.codeParts.otherLogics;

import compilers.codeParts.CodePart;

public class Wait  extends CodePart {
    String waitTime;
    Wait(String waitTime){
        this.waitTime = waitTime;
    }

    @Override
    public String getAsCompiledCode(int previousCPLastLineIndex){
        return String.format("wait %s", waitTime);
    }
}
