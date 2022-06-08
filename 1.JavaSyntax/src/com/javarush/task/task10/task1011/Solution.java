package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] chars = text.toCharArray();
        for (int i=0; i < 40; i++){
            int k = i;
            for (int j=0; j < chars.length; j++){
                System.out.print(chars[k]);
                k++;
                if(k == chars.length) break;
            }
            System.out.print("\n");
        }
    }

}

