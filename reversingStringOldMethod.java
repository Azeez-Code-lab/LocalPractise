package com.br.javaPrractise.reverse;

import java.util.Scanner;

public class reversingStringOldMethod {
    public static void main(String []args){
        String se, reverse="";
        Scanner kb=new Scanner(System.in);
        se= kb.nextLine();
        for(int i=se.length()-1;i>=0;i--){
            reverse=reverse+se.charAt(i);
        }
        System.out.println(reverse);
        if(reverse.equals(se)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
