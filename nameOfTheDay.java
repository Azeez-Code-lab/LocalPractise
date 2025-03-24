package com.br.javaPrractise.TargetHundred;

import java.time.*;

public class nameOfTheDay {
    public static String findDay(int month, int day, int year){
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek=date.getDayOfWeek();
        return dayOfWeek.toString();
    }
    public static String findMonth(int month, int day, int year){
        LocalDate date = LocalDate.of(year, month, day);
        Month monthofYear=date.getMonth();
        return monthofYear.toString();
    }
    public static void main(String[] args) {
        int month=7,day=3,year=2024;
        nameOfTheDay dd=new nameOfTheDay();
        System.out.println(dd.findDay(month,day,year));
        System.out.println(dd.findMonth(month,day,year));
    }
}
