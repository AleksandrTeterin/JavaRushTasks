package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String,String> people = new HashMap<String,String>();
        people.put("aaa","sss");
        people.put("fff","ddd");
        people.put("aaa","fff");
        people.put("aaa","ggg");
        people.put("ggg","sss");
        people.put("ttt","sss");
        people.put("yyy","sss");
        people.put("uuu","sss");
        people.put("ppp","sss");
        people.put("kkk","sss");
        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
