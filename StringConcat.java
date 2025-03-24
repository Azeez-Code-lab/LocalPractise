package com.br.javaPrractise.String;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringJoiner;

public class StringConcat {
    public static void main(String args[]){
        //with +
        String s="Azeez"+"123";
        System.out.println(s);

        //with concat
        String s1="Azeez";
        String s2="Abdul";
        String se=s1.concat(s2);
        System.out.println(se.toString());

        //String Builder
        StringBuilder se1=new StringBuilder("Azeez");
        StringBuilder se2=new StringBuilder("Abdul");
        StringBuilder se3=se1.append(se2);
        System.out.println(se3);

        //with string join
        String sp1="String";
        String sp2="join";
        String sp=String.join("",sp1,sp2);
        System.out.println(sp);

        //with string joiner
        StringJoiner ee=new StringJoiner(",");
        ee.add("String ");
        ee.add("Joiner ");
        System.out.println(ee.toString());

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date Format with MM/dd/yyyy : "+strDate);


        String str = "India is my country";
        System.out.println(charRemoveAt(str, 7));

    }
    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
}
