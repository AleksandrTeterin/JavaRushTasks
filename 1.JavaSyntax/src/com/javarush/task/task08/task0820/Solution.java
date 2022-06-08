package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<Dog>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> rez = new HashSet<Object>();
        Iterator<Cat> itr_cat = cats.iterator();
        while (itr_cat.hasNext()){
            rez.add(itr_cat.next());
        }
        Iterator<Dog> itr_dog = dogs.iterator();
        while (itr_dog.hasNext()){
            rez.add(itr_dog.next());
        }
        return rez;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
       Iterator<Object> itr_pets = pets.iterator();
       while (itr_pets.hasNext()){
           Object current_pet = itr_pets.next();
           if (current_pet instanceof Cat){
               if (cats.contains(current_pet)){
                   itr_pets.remove();
               }
           }
       }
    }

    public static void printPets(Set<Object> pets) {
        Iterator<Object> itr_pets = pets.iterator();
        while (itr_pets.hasNext()){
            Object current_pet = itr_pets.next();
            System.out.println(current_pet.toString());
        }
    }

    public static class Cat{

    }

    public static class Dog{

    }
}
