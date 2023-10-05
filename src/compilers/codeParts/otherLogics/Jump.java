package compilers.codeParts.otherLogics;

import arc.struct.Seq;
import compilers.codeParts.CodePart;
import mindustry.gen.Call;

public class Jump extends CodePart {
    String boolOperation;
    String firstArg;
    String secondArg;
    int jumpToIndex;
    public Jump(String boolOperation, String firstArg, String secondArg, int jumpToIndex){
        this.boolOperation = boolOperation;
        this.firstArg = firstArg;
        this.secondArg = secondArg;
        this.jumpToIndex = jumpToIndex;
    }

    @Override
    public String getAsCompiledCode(int previousCPLastLineIndex){
        return String.format("jump %s %s %s %s", jumpToIndex, boolOperation, firstArg, secondArg);
    }
}
