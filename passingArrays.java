package com.br.javaPrractise.Arrays;

import java.util.Scanner;

public class passingArrays {
    public static void display(int m[]){
        for(int k:m){
            System.out.println(k);
        }
    }
    public static void main(String args[]){
        int marks[]=new int[5];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            marks[i]=input.nextInt();
        }
        display(marks);
    }
}
