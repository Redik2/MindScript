package compilers.codeParts.loops;

import arc.struct.Seq;
import compilers.codeParts.CodePart;

public abstract class Cycle extends CodePart{
    protected Seq<CodePart> insideCode;
    protected Seq<CodePart> allCycleCodeParts;
    int compiled_space;
    protected Cycle(int compiled_space, Seq<CodePart> insideCode)
    {
        this.compiled_space = compiled_space;
        this.insideCode = insideCode;
    }
}
