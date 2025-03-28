package com.br.javaPrractise.Leet_CodePractise;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(new MultiplyStrings().multiply("123","456"));
    }

    public String multiply(String num1, String num2) {
        int m=num1.length();
        int n=num2.length();

        StringBuilder sb=new StringBuilder();
        int[] pos=new int[m+n];

        for (int i = m - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
                final int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                final int sum = multiply + pos[i + j + 1];
                pos[i + j] += sum / 10;
                pos[i + j + 1] = sum % 10;
            }
        }
        for (final int p : pos)
            if (p > 0 || sb.length() > 0)
                sb.append(p);

        return sb.length() == 0 ? "0" : sb.toString();
    }
}