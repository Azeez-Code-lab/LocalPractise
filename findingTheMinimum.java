package com.br.javaPrractise.Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class findingTheMinimum {
    static void min(Integer[] mini){
        int minimum=mini[0];
        for(int i = 0; i<mini.length; i++){
            if(minimum>mini[i]){
                minimum=mini[i];
            }
        }
        System.out.println(minimum);

    }
    public static void main(String[] args) {
        Integer[]arr={12,23,34,452,3};
        findingTheMinimum vv=new findingTheMinimum();
        List<Integer> li= Arrays.asList(arr);
        System.out.println(Collections.min(li));
        min(arr);
        Arrays.stream(arr).min(Integer::compareTo);
    }
}
