package compilers.codeParts.otherLogicsCodeParts;

import compilers.codeParts.CodePart;

public class Wait  extends CodePart {
    String waitTime;
    Wait(String waitTime){
        super(1);
        this.waitTime = waitTime;
    }

    public String getAsCompiledCode(){
        return String.format("wait %s", waitTime);
    }
}
