package com.br.javaPrractise.Duplicates;

import org.checkerframework.checker.units.qual.C;

import java.util.*;

public class duplicatesInString {
    public static void main(String args[]){
        String name="Azeez";
        char[] ch=name.toCharArray();
        List<String> tt=new ArrayList<>();
        int count=0;
        for(int i=0;i<name.length();i++){
            tt.add(String.valueOf(ch[i]));
            for(int j=i+1;j<name.length();j++){
                if(name.charAt(i)==name.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
        Set<String> se=new HashSet<>(tt);
        for(String temp:se){
            System.out.println(temp+" "+":"+Collections.frequency(tt,temp));
        }
        //duplicate finding with collections usage
                List<String> list = new ArrayList<String>();
                list.add("a");
                list.add("b");
                list.add("c");
                list.add("d");
                list.add("b");
                list.add("c");
                list.add("a");
                list.add("a");
                list.add("a");
                System.out.println("Count all with frequency");
                Set<String> uniqueset=new HashSet<>(list);
                for(String temp:uniqueset){
                    System.out.println(temp + ": " + Collections.frequency(list,temp));
                }
                System.out.println(Collections.frequency(list,"a"));



    }
}
