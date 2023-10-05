package compilers.codeParts.otherLogicsCodeParts;

import compilers.codeParts.CodePart;

public class Wait  extends CodePart {
    String waitTime;
    Wait(String waitTime){
        this.waitTime = waitTime;
        super(1);
    }

    public String getAsCompiledCode(){
        return String.format("wait %s", waitTime);
    }
}
