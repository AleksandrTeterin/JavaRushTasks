package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String str = bfr.readLine();
        StringBuffer str_buf = new StringBuffer(str);
        List<Character> vowel = new ArrayList<>();
        List<Character> notVowel = new ArrayList<>();
        for (int i=0; i<str_buf.length(); i++){
            if (isVowel(str_buf.charAt(i))) {
                vowel.add(str_buf.charAt(i));
            }
            else if (str_buf.charAt(i) != '\u0020') {
                notVowel.add(str_buf.charAt(i));
            }
        }
        for(int i=0; i< vowel.size(); i++)
            System.out.print(vowel.get(i)+" ");
        System.out.print("\n");
        for(int i=0; i< notVowel.size(); i++)
            System.out.print(notVowel.get(i)+" ");
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}