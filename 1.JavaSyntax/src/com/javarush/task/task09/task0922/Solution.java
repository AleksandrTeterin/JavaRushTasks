package com.javarush.task.task09.task0922;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String dateString = bfr.readLine();

        SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
        Date day = inputDateFormat.parse(dateString);

        SimpleDateFormat outputDateFormat = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        dateString = outputDateFormat.format(day);

        System.out.println(dateString.toUpperCase(Locale.ROOT));
    }
}
