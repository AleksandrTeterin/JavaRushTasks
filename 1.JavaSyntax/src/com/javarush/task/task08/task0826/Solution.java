package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j]<array[j+1]){
                    int buf = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buf;
                }
            }
        }
//        sortByHoara(array, 0, array.length-1);
    }

//    public static void sortByHoara(int[] array, int lo, int hi){
//        if (lo<hi) {
//            int p = getPivot(array,lo,hi);
//            sortByHoara(array,lo,p);
//            sortByHoara(array,p+1,hi);
//        }
//    }
//
//    public static int getPivot(int[] array, int lo, int hi){
//        int pivot = array[(lo+hi)/2];
//        int i=lo;
//        int j=hi;
//        while (true){
//            while (array[i] > pivot) i++;
//            while (pivot > array[j]) j--;
//            if(i>=j) return j;
//            swap(array,i,j);
//        }
//    }
//
//    public static void swap(int[] array, int i, int j){
//        int buf = array[i];
//        array[i] = array[j];
//        array[j] = buf;
//    }
}
