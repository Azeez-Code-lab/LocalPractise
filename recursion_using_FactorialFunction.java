package com.br.javaPrractise.recursion;

public class recursion_using_FactorialFunction {
    static int fact=1;
    static long factorial(int num){
        long result;
        if(num>1) {
            fact=fact*num;
            factorial(num-1);
        }
        return fact;
    }
    public static void main(String args[]){
        System.out.println("Factorial of the num 5 is");
        System.out.println(recursion_using_FactorialFunction.factorial(5));

    }
}
