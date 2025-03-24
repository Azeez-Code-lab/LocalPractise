package com.br.javaPrractise.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class maxInArray {
    public static void main(String args[]){
        Integer a[]={9,3,6,4,8,5};

        Integer max = Collections.max((Arrays.asList(a)));
        System.out.println(max);
    }
}
