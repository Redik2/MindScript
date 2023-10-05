package compilers.codeParts.blockControlsCodeParts;

import compilers.codeParts.CodePart;

public class Sensor extends CodePart{
    String returnVarName;
    String blockVarName;
    String sensorType;

    Sensor(String returnVarName, String blockVarName, String sensorType)
    {
        this.returnVarName = returnVarName;
        this.blockVarName = blockVarName;
        this.sensorType = sensorType;
    }
    public String getAsCompiledCode(){
        return String.format("sensor %s %s %s", returnVarName, blockVarName, sensorType);
    }
}
