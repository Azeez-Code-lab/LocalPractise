package com.br.javaPrractise.Arrays;

public class copingOfArray {
    public static void main(String[] args) {
        char[] copyFrom={'S','H','A','I','K','A','Z','E','E','Z'};
        char[] copyTo=new char[7];
        System.arraycopy(copyFrom,3,copyTo,0,7);
        System.out.println(String.valueOf(copyTo));



    }
}
