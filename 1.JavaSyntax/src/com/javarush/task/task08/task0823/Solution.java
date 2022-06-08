package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        List<String> str_array = new ArrayList<String>();
        Scanner scr = new Scanner(string);
        while (scr.hasNext()){
            String str = scr.next();
            String upCaseStr = str.toUpperCase();
            //str_array.add(scr.next());
            char fl = upCaseStr.charAt(0);
            str_array.add(fl+str.substring(1));
        }
        for (int i=0; i<str_array.size(); i++){
            System.out.print(str_array.get(i)+" ");
        }
    }
}
