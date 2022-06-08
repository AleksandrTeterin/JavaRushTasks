package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> map = new HashMap<>();
        while (true){
            String cur_id = reader.readLine();
            if (cur_id.isEmpty()) break;
            String cur_name = reader.readLine();
            map.put(cur_name,Integer.parseInt(cur_id));
        }
        for (Map.Entry<String,Integer> pair: map.entrySet()){
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
