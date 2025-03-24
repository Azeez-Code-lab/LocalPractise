package com.br.javaPrractise.TargetHundred;

public class runTimePolymorphismsVsCompileTimePolymorphism {
    static int multiply(int a, int b){
        return a*b;
    }
    static int multiply(int a,int b,int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5,2));
        System.out.println(multiply(1,4,6));

    }
}
