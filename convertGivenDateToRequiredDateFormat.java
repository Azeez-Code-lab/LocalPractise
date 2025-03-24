package com.br.javaPrractise.Date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class convertGivenDateToRequiredDateFormat {
    public static void main(String args[]) throws ParseException {
        String originalDateString = "2025-01-16"; // Original date in yyyy-MM-dd format
        String desiredFormat = "MM/dd/yyyy"; // Desired format

        SimpleDateFormat originalFormat = new SimpleDateFormat(desiredFormat);
        Date date = originalFormat.parse(originalDateString);
        // Format the date object into the desired format
        SimpleDateFormat desiredDateFormat = new SimpleDateFormat(desiredFormat);
        String formattedDate = desiredDateFormat.format(date);

        System.out.println("Original Date: " + originalDateString);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
