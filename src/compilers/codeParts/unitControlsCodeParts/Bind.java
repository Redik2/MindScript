package compilers.codeParts.unitControlsCodeParts;

import compilers.codeParts.CodePart;

public class Bind extends CodePart{
    String bindType;
    Wait(String bindType){
        this.bindType = bindType;
        super(1);
    }

    public String getAsCompiledCode(){
        return String.format("bind %s", bindType);
    }
}
