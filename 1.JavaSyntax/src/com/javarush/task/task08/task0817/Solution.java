package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<>();
        map.put("Ivanov","Sasha");
        map.put("Petrov","Sasha");
        map.put("Egorov","Sasha");
        map.put("Teterin","Sasha");
        map.put("Sidorov","Sasha");
        map.put("Antonov","Sasha");
        map.put("Fedorov","Sasha");
        map.put("Timohin","Sasha");
        map.put("Danilov","Sasha");
        map.put("Alekseev","Sasha");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String,String> map_copy = new HashMap<>(map);
        for (Map.Entry<String,String> pair_copy: map_copy.entrySet()){
            int count = 0;
            for (Map.Entry<String,String> pair : map.entrySet()){
                if (pair.getValue().equals(pair_copy.getValue())){
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, pair_copy.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String,String> copy_map = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy_map.entrySet()) {
            if (pair.getValue().equals(value)) {
                        map.remove(pair.getKey());
                }
            }
        }

    public static void main(String[] args) throws RuntimeException {
        Map<String,String> map = new HashMap<>(createMap());
        //System.out.println(map.size());
        removeTheFirstNameDuplicates(map);
        //System.out.println(map.size());
    }
}
