package compilers.codeParts.loops;

import arc.struct.Seq;
import compilers.codeParts.CodePart;
import compilers.codeParts.math.*;
import compilers.codeParts.otherLogics.Jump;

public class ForCycle extends Cycle {
    int startValue, maxValuePlusOne, step;
    ForCycle(int startValue, int maxValuePlusOne, int step, Seq<CodePart> insideCode) {
        super(insideCode.size+3, insideCode);

        this.startValue = startValue;
        this.step = step;
        this.maxValuePlusOne = maxValuePlusOne;
    }

    @Override
    public String getAsCompiledCode(int previousCPLastLineIndex) {
        allCycleCodeParts.add(new Set("i", String.valueOf(startValue)));
        allCycleCodeParts.add(insideCode);
        allCycleCodeParts.add(new Operation("i", "i", "add", String.valueOf(step)));
        allCycleCodeParts.add(new Jump("lessThan", "i", "10", previousCPLastLineIndex+2));
        StringBuilder resultCode = new StringBuilder();
        for(int i = 0; i < allCycleCodeParts.size; i++){
            resultCode.append(allCycleCodeParts.get(i).getAsCompiledCode(previousCPLastLineIndex + i - 1));
        }
        return resultCode.toString();
    }
}
