package compilers.codeParts.math;

import compilers.codeParts.CodePart;

public class Set extends CodePart {
    String name;
    String value;
    public Set(String name, String value){
        this.name = name;
        this.value = value;
    }

    @Override
    public String getAsCompiledCode(int previousCPLastLineIndex) {
        return String.format("set %s %s", name, value);
    }
}
