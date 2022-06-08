package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //List<String> list = new ArrayList<>();
        Map<String,String> list = new HashMap<String,String>();
        while (true) {

            String sity = reader.readLine();
            if (sity.isEmpty()) {
                break;
            }

            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.put(sity,family);
        }

        // Read the house number
        //int houseNumber = Integer.parseInt(reader.readLine());
        String sityName = reader.readLine();
        String familyName = list.get(sityName);
        System.out.println(familyName);

//        if (0 <= houseNumber && houseNumber < list.size()) {
//            String familyName = list.get(houseNumber);
//            System.out.println(familyName);
//        }
    }
}
