package com.br.javaPrractise.recursion;

public class recursion_WithoutUsing_FactorialFunction {
    static long factorial(int num) {
        long fact = 1;
        while (num > 0) {
            fact *= num--;
        }
        return fact;
    }
    public static void main(String args[]){
        System.out.println("Factorial of the num 5 is");
        System.out.println(recursion_WithoutUsing_FactorialFunction.factorial(5));
    }

}
