package com.br.javaPrractise.Numbers;

public class roundUP {
    public static void main(String[] args) {
        double value = 3.14;
        double roundedUp = Math.ceil(value);
        System.out.println(roundedUp);
        String format=String.format("%.4g%n", 0.912385);
        System.out.println(format);
    }
}
