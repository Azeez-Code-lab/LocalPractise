package com.br.javaPrractise.String;

public class subString {
    public static void main(String[] args) {
        String name="Azeez", sub;
        for(int c=0;c<name.length();c++){
            for(int i=1;i<name.length()-1;i++){
                sub=name.substring(c,c+i);
                System.out.println(sub);
            }
        }

    }
}
