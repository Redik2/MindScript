package compilers.codeParts.unitControlsCodeParts;

import compilers.codeParts.CodePart;

public class Control extends CodePart {
    enum ControlType
    {
        idle,
        stop,
        move,
        approach,
        pathfind,
        autoPathfind,
        boost,
        target,
        targetp,
        itemDrop,
        itemTake,
        payDrop,
        payTake,
        payEnter,
        mine,
        flag,
        build,
        getBlock,
        within,
        unbind
    }
    ControlType controlType;
    String singleVar;
    String x;
    String y;
    String blockVarName;
    String amount;
    String otherVar;
    String returnVarName;

    Control(ControlType controlType)
    {
        this.controlType = controlType;
    }
    Control(ControlType controlType, String singleVar)
    {
        this.controlType = controlType;
        this.singleVar = singleVar;
    }
    Control(ControlType controlType, String arg1, String arg2)
    {
        this.controlType = controlType;
        switch (controlType) {
            case ControlType.move -> {
                this.x = arg1;
                this.y = arg2;
                break;
            }
            case ControlType.pathfind ->  {
                this.x = arg1;
                this.y = arg2;
                break;
            }
            case ControlType.itemDrop ->  {
                this.blockVarName = arg1;
                this.amount = arg2;
                break;
            }
        }
    }
} // крч хз, делай сам, а то я щас сломаю еще что нибудь и вообще запутаемся
