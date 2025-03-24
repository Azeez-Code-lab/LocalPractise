package com.br.javaPrractise.Date;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class localDate {
    public static void main(String args[]) throws ParseException {
        LocalDate date1=LocalDate.now();
        LocalTime time1=LocalTime.now();
        System.out.println(date1);
        System.out.println(time1);
        String wantedDate="11/05/1998";
        double d=0.67;
        SimpleDateFormat ds=new SimpleDateFormat("MM/dd/yyyy");
        Date sd=ds.parse(wantedDate);
        System.out.println(sd);
        System.out.println(String.format("%.7f",d));

        Calendar calendar = Calendar.getInstance();
    }
}
