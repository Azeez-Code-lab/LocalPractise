package com.br.javaPrractise.Numbers;

public class palindromNumCheck {
    public static void main(String[] args) {
        int num = -909, r, sum = 0, temp;
        temp = num;
        while (num > 0) {
            r = num % 10;
            sum= (sum*10)+r;
            num = num / 10;
        }
        if (temp==sum)
        {
            System.out.println("palindrome number ");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }

}

