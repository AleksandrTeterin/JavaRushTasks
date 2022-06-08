package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        //System.out.println("Enter the month name: ");
        Scanner scr = new Scanner(System.in);
        String nameOfMonth = "";
        if (scr.hasNextLine()){
            nameOfMonth = scr.nextLine();
        }

        List<String> month = new ArrayList<>(12);
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");

        if (month.contains(nameOfMonth))
                System.out.println(nameOfMonth + " is the " + (month.indexOf(nameOfMonth)+1) + " month");
        else
            System.out.println(nameOfMonth+" не является месяцем!");
    }
}
