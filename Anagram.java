package com.br.javaPrractise.Leet_CodePractise;

import org.junit.Assert;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String name="String";
        String jame="tirnsg";
        char[] namechar=name.toCharArray();
        char[] jamechar=name.toCharArray();
        Arrays.sort(namechar);
        Arrays.sort(jamechar);
       Arrays.equals(namechar, jamechar);
    }
}
