package com.br.javaPrractise.Arrays;

public class Left_Rotate_the_Array_by_One {
    static void solve(int arr[], int n) {
        int temp[]=new int[n];
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+" ");
        }

    }
    public static void main(String args[]) {
        int n=3;

        int arr[]= {1,2,3,4,5};
        solve(arr, n);
    }
}
