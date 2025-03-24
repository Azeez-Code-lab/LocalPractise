package com.br.javaPrractise.Arrays;

public class returnofarrayfrommethod {
    public static void main(String args[]){
        int arr[]=m1();
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");}

    }
    public static int[] m1(){
        return new int[] {1,2,3,4,5,};
    }
    }


