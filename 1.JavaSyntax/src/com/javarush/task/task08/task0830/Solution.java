package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/* 
Задача по алгоритмам Ӏ Java Syntax: 8 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
//        ArrayList<String> sort_list = new ArrayList<String>(array.length);
//        for (String element: array) {
//            sort_list.add(element);
//        }
//        sort_list.sort(String::compareTo);
//        array = sort_list.toArray(new String[0]);
        // Сортировка по Хоару
        //sortHoar(array,0, array.length-1);
        // Сортировка пузырьком
        for (int i=0; i < array.length-1; i++) {
            for (int j=i+1; j < array.length; j++) {
                if(isGreaterThan(array[i],array[j])){
                    String buf = array[j];
                    array[j] = array[i];
                    array[i] = buf;
                }
            }
        }
    }

//    public static void sortHoar(String[] array, int lo, int hi) {
//        // Если в сортируемом массиве больше одного элемента
//        if (lo < hi){
//            // определим индекс опорного элемента для переданного массива
//            int p = partition(array, lo, hi);
//            // отсортируем левую часть массива
//            sortHoar(array,lo,p);
//            // отсортируем правую часть массива
//            sortHoar(array,p+1,hi);
//        }
//    }
//    public static Integer partition(String[] array, int lo, int hi) {
//        // возьмем значение среднего элемента массива
//        String pivot = array[(lo+hi)/2];
//        // проверим все элементы слева от опорного элемента и найдем который больше него (если такого нет вернется индекс опорного)
//        int i = lo;
//        int j = hi;
//        while (true) {
//            while (isGreaterThan(pivot, array[i])) i++;
//            // проверим все элементы справа от опопрного и найдем который меньше него (если такого нет вернется индекс опорного)
//            while (isGreaterThan(array[j], pivot)) j--;
//            // если все элементы слева от опорного меньше него, а элементы справа больше, то вернем индекс опорника
//            if (i >= j) return j;
//            // если такие элементы найдены, то поменяем их местами элементы i и j
//            String buf = array[i];
//            array[i] = array[j];
//            array[j] = buf;
//        }
//    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
