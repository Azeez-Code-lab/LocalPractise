package com.br.javaPrractise.Duplicates;

import java.util.Arrays;
import java.util.Collections;

public class Moving_Zeros_to_one_Side_In_Array {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,0,5,6,7,0,34,56};
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
//        int n=arr.length,i=0;
//        int[] temp = new int[n];
//        for(int j=0;j<arr.length;j++){
//            if(arr[j]!=0){
//                temp[i]=arr[j];
//                i++;
//            }
//        }
//        while(i<n){
//            temp[i++]=0;
//        }
//        for (int k = 0; k < n; k++) {
//            arr[k] = temp[k];
//        }
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
        rightSide(arr).toString();
        leftSide(arr).toString();

    }
    public static int[] rightSide(int[] arr){
        int n=arr.length,i=0;
        int[] temp = new int[n];
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                temp[i]=arr[j];
                i++;
            }
        }
        while(i<n){
            temp[i++]=0;
        }
        for (int k = 0; k < n; k++) {
            arr[k] = temp[k];
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        return arr;
    }
    public static int[] leftSide(int[] arr){
        int n=arr.length,i=n-1;
        int[] temp=new int[n];
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                temp[i]=arr[j];
                i--;
            }
        }
        while(i<0){
            temp[--i]=0;
        }
        for (int k = 0; k < n; k++) {
            arr[k] = temp[k];
        }
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }
        return arr;
    }
}
