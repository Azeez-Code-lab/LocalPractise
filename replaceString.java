package com.br.javaPrractise.reverse;

public class replaceString {
    public static void main(String []args){
        String s1="My name is Rajendra. My name is lamror. My name is Technolamror.";
        int isNum=s1.replace("is","").length();
        System.out.println(s1.replace("is","was"));
    }
}
