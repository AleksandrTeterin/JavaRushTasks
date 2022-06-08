package com.javarush.task.task08.task0814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() throws IOException {
        Set<Integer> setInt= new HashSet<Integer>();
            setInt.add(1);
            setInt.add(2);
            setInt.add(3);
            setInt.add(4);
            setInt.add(5);
            setInt.add(6);
            setInt.add(7);
            setInt.add(8);
            setInt.add(9);
            setInt.add(10);
            setInt.add(11);
            setInt.add(12);
            setInt.add(13);
            setInt.add(14);
            setInt.add(15);
            setInt.add(16);
            setInt.add(17);
            setInt.add(18);
            setInt.add(19);
            setInt.add(20);
        return setInt;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> set_copy = new HashSet<>(set);
        for (int element: set_copy) {
            if (element > 10) {
                set.remove(element);
            }
        }
        return set;
    }

    public static void main(String[] args) throws IOException{
        Set<Integer> my_set = new HashSet<>(createSet());
        my_set = removeAllNumbersGreaterThan10(my_set);
    }
}
