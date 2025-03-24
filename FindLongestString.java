package com.br.javaPrractise.Arrays;

import java.util.Arrays;

public class FindLongestString {
    public static void main(String[] args) {
        String[] arr={"apple", "banana", "kiwi", "pear"};
        int elementLength=arr[0].length();
        int index=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i].length() > elementLength){
               index=i;
               elementLength=arr[i].length();
           }
       }
       System.out.println(arr[index]);
    }
}
