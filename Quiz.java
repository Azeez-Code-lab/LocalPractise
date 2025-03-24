package com.br.javaPrractise.String;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz {
    public static void main(String args[]) throws ParseException {
        String s=" Wild ",v=" Irish ",c=" Rose ";
        String result=s.concat(v.concat(c));
        System.out.println(result);

        String str_date = "11-June-07";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss,a");
        Date date = new Date(str_date);
        System.out.println(formatter.format(date));
    }
}
