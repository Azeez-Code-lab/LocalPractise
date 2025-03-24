package com.br.javaPrractise.TargetHundred;

public class BinarySearchEx {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int target=7;
        int result=binarysearc(arr,target);
        if(result!=-1){
            System.out.println("Element found at index "+result);
        }
        else{
            System.out.println("Element not found at index "+result);
        }
    }

    public static int binarysearc(int[] arr, int target) {
        int starting=0;
        int ending=arr.length-1;
        while(starting<=ending){
            int mid=(starting+ending)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                starting=mid+1;
            }
            else {
                ending=mid-1;
            }
        }
        return -1;


    }
}
