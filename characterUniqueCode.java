package com.br.javaPrractise.Character;

public class characterUniqueCode {
    //from https://unicode-table.com you can get all the code values for all keys in keyword
    public static void main(String[] args) {
        char c='\u0043';
        char b=65,b_hex=0x0041,b_binary=0b0100_0001;
        System.out.println(b);
        System.out.println(b_hex);
        System.out.println(b_binary);
    }
}
