package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name, sername, family, nik, adress;
        private Integer age;

        public Human(String name, String sername, String family, String nik, String adress, Integer age)
        {
            this.name = name;
            this.sername = sername;
            this.family = family;
            this.nik = nik;
            this.adress = adress;
            this.age = age;
        }

        public Human(String name, String sername, String family, String nik, String adress)
        {
            this.name = name;
            this.sername = sername;
            this.family = family;
            this.nik = nik;
            this.adress = adress;
            this.age = 30;
        }

        public Human(String name, String sername, String family, String nik)
        {
            this.name = name;
            this.sername = sername;
            this.family = family;
            this.nik = nik;
            this.adress = "adress";
            this.age = 40;
        }

        public Human(String name, String sername, String family)
        {
            this.name = name;
            this.sername = sername;
            this.family = family;
            this.nik = "nik";
            this.adress = "adress";
            this.age = 50;
        }

        public Human(String name, String sername)
        {
            this.name = name;
            this.sername = sername;
            this.family = "family";
            this.nik = "nik";
            this.adress = "adress";
            this.age = 60;
        }

        public Human(String name)
        {
            this.name = name;
            this.sername = "sername";
            this.family = "family";
            this.nik = "nik";
            this.adress = "adress";
            this.age = 70;
        }

        public Human(String name, Integer age)
        {
            this.name = name;
            this.sername = "sername";
            this.family = "family";
            this.nik = "nik";
            this.adress = "adress";
            this.age = age;
        }

        public Human(Integer age, String adress)
        {
            this.name = "name";
            this.sername = "sername";
            this.family = "family";
            this.nik = "nik";
            this.adress = adress;
            this.age = age;
        }

        public Human(String name, Integer age, String adress)
        {
            this.name = name;
            this.sername = sername;
            this.family = family;
            this.nik = nik;
            this.adress = adress;
            this.age = age;
        }

        public Human()
        {
            this.name = "name";
            this.sername = "sername";
            this.family = "family";
            this.nik = "nik";
            this.adress = "adress";
            this.age = 70;
        }
    }
}
