package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        // напишите тут ваш код
        Map<Character, Integer> litteralsCount = new HashMap<Character, Integer>();

        for (int i=0; i < list.size(); i++){

            String current_str = list.get(i);
            StringBuffer str_buf = new StringBuffer();
            StringBuffer chars = str_buf.append(current_str);

            for (int j=0; j < chars.length(); j++) {
                char current_ch = chars.charAt(j);
                if (alphabet.contains(current_ch)){
                    if (litteralsCount.containsKey(current_ch)){
                        int curr_count = litteralsCount.get(current_ch);
                        litteralsCount.put(current_ch,++curr_count);
                    } else {
                        litteralsCount.put(current_ch,1);
                    }
                }
            }
        }

        for (int i=0; i < alphabet.size(); i++) {
            Character cur_ch = alphabet.get(i);
            Integer cur_count = litteralsCount.get(cur_ch) != null ?litteralsCount.get(cur_ch) : 0;
            System.out.println(cur_ch+" "+cur_count);
        }
    }
}
