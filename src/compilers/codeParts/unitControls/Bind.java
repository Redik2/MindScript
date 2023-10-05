package compilers.codeParts.unitControls;

import compilers.codeParts.CodePart;

public class Bind extends CodePart{
    String bindType;
    Bind(String bindType){
        this.bindType = bindType;
    }

    @Override
    public String getAsCompiledCode(int previousCPLastLineIndex){
        return String.format("bind %s", bindType);
    }
}
