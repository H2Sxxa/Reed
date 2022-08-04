package com.h2sxxa.reed.tool;

import java.util.Map;

public class MiscTool {
    public static String updateKeyString(Map<String,?> Element,String Raw) {
        for(Map.Entry<String,?> entry:Element.entrySet()){
            Raw=Raw.replaceAll(entry.getKey(),entry.getValue().toString());
        }
        return Raw;
    }
    
}
