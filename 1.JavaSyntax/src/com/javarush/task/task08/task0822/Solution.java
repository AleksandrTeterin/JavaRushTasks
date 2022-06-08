package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = 0;
        for(int i=0; i<array.size(); i++){
            if(i==0) min = array.get(i);
            else if(array.get(i)<min) min = array.get(i);
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        Scanner scr = new Scanner(System.in);
        int n = 0;
        if(scr.hasNextInt()) n = scr.nextInt();
        else {
            System.out.println("Enter correct number of array.");
            return null;
        }
        List<Integer> lst = new ArrayList<>(n);
        for(int i=0; i < n; i++)
            lst.add(scr.nextInt());
        return lst;
    }
}
