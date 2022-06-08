package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {

        List<String> str_array = new ArrayList<>();
        List<Integer> int_array = new ArrayList<>();
        Map<Integer, Boolean> map_array = new HashMap<>();
        for(int i=0; i < array.length; i++) {
                if(isNumber(array[i])){
                    map_array.put(i,true);
                    int_array.add(Integer.parseInt(array[i]));
                } else {
                    map_array.put(i,false);
                    str_array.add(array[i]);
                }
        }

        for(int i=0; i<int_array.size(); i++)
        {
            for(int j=i+1; j<int_array.size(); j++)
            {
                if(int_array.get(j)>int_array.get(i))
                {
                    int buf = int_array.get(i);
                    int_array.set(i, int_array.get(j));
                    int_array.set(j,buf);
                }
            }
        }

        for(int i=0; i<str_array.size(); i++)
        {
            for(int j=i+1; j<str_array.size(); j++)
            {
                if(isGreaterThan(str_array.get(i),str_array.get(j))){
                    String buf = str_array.get(i);
                    str_array.set(i, str_array.get(j));
                    str_array.set(j,buf);
                }
            }
        }

        int i,j;
        i = j = 0;
        for (Map.Entry<Integer,Boolean> pair: map_array.entrySet()){
            int key = pair.getKey();
            Boolean value = pair.getValue();
            if (value){
                array[key] = int_array.get(i).toString();
                i++;
            } else {
                array[key] = str_array.get(j);
                j++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}
