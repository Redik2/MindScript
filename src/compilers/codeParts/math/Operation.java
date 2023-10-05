package compilers.codeParts.math;

import compilers.codeParts.CodePart;

public class Operation extends CodePart {
    String name;
    String firstArg;
    String operation;
    String secondArg;
    public Operation(String name, String firstArg, String operation, String secondArg){
        this.name = name;
        this.firstArg = firstArg;
        this.operation = operation;
        this.secondArg = secondArg;
    }

    @Override
    public String getAsCompiledCode(int previousCPLastLineIndex) {
        return String.format("op %s %s %s %s", operation, name, firstArg, secondArg);
    }
}
