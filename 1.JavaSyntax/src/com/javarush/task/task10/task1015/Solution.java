package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {

        ArrayList<String>[] listOfList = new ArrayList[2];

        listOfList[0] = new ArrayList<>();
        listOfList[0].add("djfhsdjkfhsjkd dfsjkdfhskj dfjhdshsk !");
        listOfList[0].add("qqqqqqqqqqqqqqqqqqqqqqqqqq    wwwwwwwwww");
        listOfList[1] = new ArrayList<>();
        listOfList[1].add("cccccccccccccc");
        listOfList[1].add("d d d d d d d d");

        return listOfList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}