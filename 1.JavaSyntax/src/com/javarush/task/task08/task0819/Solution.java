package com.javarush.task.task08.task0819;

import jdk.nashorn.internal.ir.CatchNode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> itr = cats.iterator();
        int rmv = 0;
        while (itr.hasNext()){
            Cat current_cat = itr.next();
            if (rmv==0){
                itr.remove();
                rmv++;
            }
            else{
                rmv++;
            }
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> my_set = new HashSet<Cat>();
        my_set.add(new Cat());
        my_set.add(new Cat());
        my_set.add(new Cat());
        return my_set;
    }

    public static void printCats(Set<Cat> cats) {
        Iterator<Cat> itr = cats.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }

    public static class Cat {
//
//        @Override
//        public String toString() {
//            return "Cat's name is Cat";
//        }
    }
}
