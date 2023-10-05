package compilers.codeParts.unitControlsCodeParts;

import compilers.codeParts.CodePart;

public class Bind extends CodePart{
    String bindType;
    Bind(String bindType){
        super(1);
        this.bindType = bindType;
    }

    public String getAsCompiledCode(){
        return String.format("bind %s", bindType);
    }
}
