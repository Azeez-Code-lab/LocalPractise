package com.br.javaPrractise.Numbers;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        int i=0,j=1,sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=2;k<=n;k++){
            sum=i+j;
            if(sum<=10)
            i=j;
            j=sum;
            System.out.println(sum);
        }
    }
}
