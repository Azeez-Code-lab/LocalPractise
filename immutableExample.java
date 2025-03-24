package com.br.javaPrractise.String;

public class immutableExample {
    public static void main(String args[]){
        //mutable Example
        String s="Azeez";
        s.concat(" is a Automation Test Engineer");
        System.out.println(s);

        //Immutable Example
        String s1="Azeez";
        String s2=s.concat("is a Automation Test Engineer");
        System.out.println(s2);

    }

}
