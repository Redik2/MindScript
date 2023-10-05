package compilers.codeParts.blockControlsCodeParts;

import compilers.codeParts.CodePart;

public class Radar  extends CodePart {
    enum FilterType {
        any,
        ally,
        player,
        attacker,
        flying,
        boss,
        ground
    }
    FilterType filter1 = FilterType.any;
    FilterType filter2 = FilterType.any;
    FilterType filter3 = FilterType.any;
    enum SortType
    {
        distance,
        health,
        shield,
        armor,
        maxHealth
    }

    SortType sortType;
    String blockVarName;
    String sortMode; // 1 - normal / 0 - reverse
    String returnVarName;

    Radar(FilterType filter1, SortType sortType, String blockVarName, String sortMode, String returnVarName)
    {
        this.filter1 = filter1;
        this.sortType = sortType;
        this.blockVarName = blockVarName;
        this.sortMode = sortMode;
        this.returnVarName = returnVarName;
    }
    Radar(FilterType filter1, FilterType filter2, SortType sortType, String blockVarName, String sortMode, String returnVarName)
    {
        this.filter1 = filter1;
        this.filter1 = filter2;
        this.sortType = sortType;
        this.blockVarName = blockVarName;
        this.sortMode = sortMode;
        this.returnVarName = returnVarName;
    }
    Radar(FilterType filter1, FilterType filter2, FilterType filter3, SortType sortType, String blockVarName, String sortMode, String returnVarName)
    {
        this.filter1 = filter1;
        this.filter1 = filter2;
        this.filter1 = filter3;
        this.sortType = sortType;
        this.blockVarName = blockVarName;
        this.sortMode = sortMode;
        this.returnVarName = returnVarName;
    }
    public String getAsCompiledCode(){
        return String.format("radar %s %s %s %s %s %s %s", filter1.name(), filter2.name(), filter3.name(), sortType.name(), blockVarName, sortMode, returnVarName);
    }
}
