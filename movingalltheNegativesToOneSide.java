package com.br.javaPrractise.Arrays;

import java.util.Arrays;

public class movingalltheNegativesToOneSide {
    public static void main(String[] args) {
        int[] arr={-1,18,23,-2,8,12,-3,4,5,6,1,3};
        int temp=0;
        for(int j=0;j<arr.length;j++){
            for(int i=j+1;i<arr.length;i++){
                if(arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));;
    }
}
