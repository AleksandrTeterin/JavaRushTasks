package com.javarush.task.task08.task0827;

import java.lang.reflect.Array;
import java.util.*;

/*
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 3 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date carrentDate = new Date(date);
        Date startDate = new Date(date);
        startDate.setDate(1);
        startDate.setMonth(0);
        long razn = carrentDate.getTime() - startDate.getTime();
        razn = razn / (1000*60*60*24) + 1;
        return (razn%2 == 0 ? false : true);
    }
}