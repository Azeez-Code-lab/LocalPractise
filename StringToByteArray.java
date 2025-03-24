package com.br.javaPrractise.String;

import java.util.Arrays;

public class StringToByteArray {
    public static void main(String[] args) {
        String str="Azeez";
        byte[] bt=str.getBytes();
        System.out.println(Arrays.toString(bt));
    }
}
