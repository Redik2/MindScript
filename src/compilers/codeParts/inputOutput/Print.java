package compilers.codeParts.inputOutput;

import compilers.codeParts.CodePart;

public class Print extends CodePart {
    String text;
    Print(String text)
    {
        this.text = text;
    }

    public String getAsCompiledCode(){
        return String.format("print %s", text);
    }
}
