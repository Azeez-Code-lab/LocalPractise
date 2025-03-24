package com.br.javaPrractise.String;

public class stringMethods {
    public static void main(String args[]){
        String myStr = "Hello";
        char result = myStr.charAt(0);
        System.out.println("The Character at the respective index is " +result);
        int codePointAtresult = myStr.codePointAt(0);
        System.out.println(codePointAtresult);
        System.out.println(myStr.toLowerCase());
        System.out.println(myStr.toUpperCase());
        String str="Hello";
        System.out.println(myStr.equals(str));
        System.out.println(myStr.equalsIgnoreCase(str));
        System.out.println(myStr.concat(" Hai How are you doing"));
        System.out.println(myStr.indexOf('d'));
        System.out.println(myStr.replace('H','Y'));
        String myStr1 = "HELLO";
        String myStr2 = "hello";
        System.out.println(myStr1.compareToIgnoreCase(myStr2));

    }
}
