package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String,Integer> map_zp = new HashMap<String,Integer>();
        map_zp.put("teterin",324);
        map_zp.put("teterin1",324);
        map_zp.put("teterin2",123);
        map_zp.put("teterin3",42242);
        map_zp.put("teterin4",422444);
        map_zp.put("teterin5",434738);
        map_zp.put("teterin6",324);
        map_zp.put("teterin7",324);
        map_zp.put("teterin8",324);
        map_zp.put("teterin9",324);
        return map_zp;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String,Integer> map_copy = new HashMap<>(map);
        for (Map.Entry<String,Integer> pair: map_copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String,Integer> my_map = new HashMap<>(createMap());
        removeItemFromMap(my_map);
    }
}
