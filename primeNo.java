package com.br.javaPrractise.Numbers;

public class primeNo {
    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n/2
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;

    }

    public static void main(String[] args) {
        int num = 7;
        boolean value = isPrime(num);
        if (value) {
            System.out.println("is prime num");
        } else {
            System.out.println("is not prime num");
        }

    }
}
