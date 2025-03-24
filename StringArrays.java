package com.br.javaPrractise.String;

import java.util.Arrays;

public class StringArrays {
    public static void main(String args[]){
        String []name={"Madras","Delhi","Ahmedabad","Calcutta"};
        Arrays.sort(name);
        for(String names:name){
            System.out.println(names);
        }
    }
}
