package com.br.javaPrractise.String;

import java.util.Scanner;

public class VowelsAndNonVowels {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int vowelCount=0,nonVowelCount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'
                    || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u'
                    || ch == 'U'){
                vowelCount++;
            }
            else{
                nonVowelCount++;
            }
        }
        System.out.println("Count of vowels is "+vowelCount);
        System.out.println("Count of Non Vowels is "+nonVowelCount);

    }
}
