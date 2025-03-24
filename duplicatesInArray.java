package com.br.javaPrractise.Duplicates;

import java.util.Scanner;

public class duplicatesInArray {
    public static void main(String args[]){
        int n, count=0;
        System.out.print("Enter no. of elements you want in array: ");
        String s[] ={"000","1","2","4","23","123","23","000","234","1","2","4","234","111"};
        System.out.println("Enter all the numbers: ");
        for (int i = 0; i <s.length; i++)
        {
            for (int j = i + 1; j < s.length; j++)
            {
                if(s[i]==s[j]) {
                    count++;
                    System.out.println(s[j]);
                }
            }
        }
        System.out.println(count);
    }
}
