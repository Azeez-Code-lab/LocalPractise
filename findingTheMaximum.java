package com.br.javaPrractise.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findingTheMaximum {
    static void maxOfArray(Integer[] maxi){
        int max=maxi[0];
        for(int i=0;i<maxi.length;i++){
            if(max<maxi[i]){
                max=maxi[i];
            }
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        Integer[] arr={23,45,57,9,8,7,45,1};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(Arrays.stream(arr).max(Integer::compareTo));
      //  System.out.println(Arrays.stream().max(arr).getAsInt());
        System.out.println(max);
        List value= Arrays.asList(arr);
        System.out.println(Collections.max(value).toString());
        findingTheMaximum.maxOfArray(arr);
    }
}
