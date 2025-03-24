package com.br.javaPrractise.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeArrayElement {
    public static void main(String[] args) {
        int[] arr={3,2,2,3};
        List<Integer> li=new ArrayList<>();
        int target=3;
        for(int i=0,k=0;i<arr.length;i++){
            if(arr[i]!=target){
                li.add(arr[i]);
            }
        }
        System.out.println(String.valueOf(li));

    }
}
