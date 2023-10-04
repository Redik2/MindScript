package compilers.codeParts.blockControlsCodeParts;

import com.sun.jdi.connect.Connector;
import compilers.codeParts.CodePart;

public class Control  extends CodePart {
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
    int x;
    int y;
    String unitVarName;
    String shoot;
    Control(controlType type, String blockVarName, String argument){
        this.type = type;
        this.blockVarName = blockVarName;
        this.argument = argument;
    }
    Control(controlType type, String blockVarName, int x, int y, String shoot){
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

    public String getAsCompiledCode(){
        switch (type){
            case enable -> {return "...";}
            case config -> {return "...";}
            case color -> {return "...";}
            case shoot -> {return "...";}
            case shootp -> {return "...";}
        }
        return null;
    }
}
