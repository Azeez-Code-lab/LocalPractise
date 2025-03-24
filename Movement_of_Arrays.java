package com.br.javaPrractise.Arrays;

public class Movement_of_Arrays {
    public static void main(String args[]) {
        int arr[] = new int[] { 1, 3, 5, 7, 9, 11 };
        int n = arr.length;
        int k = 3; // No. of rotations
        k = k % n;
        int i, j;
        // Reverse last k numbers
        for (i = n - k, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Reverse the first n-k terms
        for (i = 0, j = n - k - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Reverse the entire array
        for (i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Print the rotated array
        for (int t = 0; t < n; t++) {
            System.out.print(arr[t] + " ");
        }
    }
}
