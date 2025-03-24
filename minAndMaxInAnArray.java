package com.br.javaPrractise.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class minAndMaxInAnArray {
    public static void main(String[] args) {
        Integer arr[]={2,23,45,54,43,24,56,76};
        List<Integer>vv=new ArrayList<>(2);
        int[] v=new int[2];
        int max=arr[arr.length-1],min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                vv.add(max);
            }else if(arr[i]<min){
                min=arr[i];
                vv.add(min);
            }
        }
        System.out.println("Smallest is "+min+ " Biggest is "+max);

        System.out.println(Collections.max(Arrays.asList(arr)));
        System.out.println(Collections.min(Arrays.asList(arr)));
    }
}
