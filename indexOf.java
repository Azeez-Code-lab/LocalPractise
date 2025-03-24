package com.br.javaPrractise.String;

public class indexOf {
    public static void main(String[] args) {
        String name="My name is Apple";
        int st=name.indexOf("is");
        int se=name.indexOf("Apple");
        System.out.println(st+" "+se);
        int td=name.indexOf("name",7);
        int ft=name.indexOf("a");
        System.out.println(td+" "+ft);
    }
}
