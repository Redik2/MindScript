package compilers.codeParts.blockControls;
import compilers.codeParts.CodePart;

public class Control extends CodePart {
    enum controlType{
        enable,
        shoot,
        shootp,
        config,
        color
    }
    controlType type;
    String blockVarName;
    String argument;
    String x;
    String y;
    String unitVarName;
    String shoot;
    Control(controlType type, String blockVarName, String argument){
        this.type = type;
        this.blockVarName = blockVarName;
        this.argument = argument;
    }
    Control(controlType type, String blockVarName, String x, String y, String shoot){
        this.type = type;
        this.blockVarName = blockVarName;
        this.x = x;
        this.y = y;
        this.shoot = shoot;
    }//shoot
    Control(controlType type, String blockVarName, String unitVarName, String shoot){
        this.type = type;
        this.blockVarName = blockVarName;
        this.unitVarName = unitVarName;
        this.shoot = shoot;
    }//shootp

    @Override
    public String getAsCompiledCode(int previousCPLastLineIndex){
        switch (type){
            case enable -> {return String.format("control enabled %s %s", blockVarName, argument);}
            case config -> {return String.format("control config %s %s", blockVarName, argument);}
            case color -> {return String.format("control color %s %s", blockVarName, argument);}
            case shoot -> {return String.format("control shoot %s %s %s", x, y, shoot);}
            case shootp -> {return String.format("control shoot %s %s", unitVarName, shoot);}
        }
        return null;
    }
}
