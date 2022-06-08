package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        StackTraceElement[] stackTr = Thread.currentThread().getStackTrace();
        String className = stackTr[2].getClassName();
        String methodName = stackTr[2].getMethodName();
        System.out.println(className+": "+methodName+": "+text);
    }
}
