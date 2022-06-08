package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner scr = new Scanner(System.in);
        List<Integer> num = new ArrayList<Integer>();
        while (true){
            try {
                num.add(Integer.parseInt(scr.nextLine()));
            }
            catch (NumberFormatException ex){
                for(int i=0;i<num.size(); i++){
                    System.out.println(num.get(i));
                }
            }
        }
    }
}
