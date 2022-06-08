package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (Throwable thw){
            thw.printStackTrace();
        }
    }

    public static void divideByZero() throws ArithmeticException{
        int a = 12 / 0;
        System.out.println(a);
    }
}
