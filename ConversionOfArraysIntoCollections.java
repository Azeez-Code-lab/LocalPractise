package com.br.javaPrractise.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConversionOfArraysIntoCollections {


    public static void main(String[] args) {
        Integer []arr={1,2,3,4,5,6,7,8,9,12,23,3,45};
        List<Integer> liArr= Arrays.asList(arr);
        Set<Integer> seta=new HashSet<>(liArr);
        System.out.println(liArr);
        System.out.println(seta);

    }
}
