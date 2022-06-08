package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.List;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(new int[] {4,3,5,7,1});
        listOfArrays.add(new int[] {4,3});
        listOfArrays.add(new int[] {4,3,5,7});
        listOfArrays.add(new int[] {4,3,5,7,1,9,2});
        listOfArrays.add(new int[] {});

        return listOfArrays;
     }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
