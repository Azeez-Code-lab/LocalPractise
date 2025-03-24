package com.br.javaPrractise.Numbers;

public class flags {
    int checkIfAnyEven(int arr[], int n)
    {
        boolean flag = false;
        int i;
        for ( i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                flag = true;
                break;
            }
        }
        return i;
    }
    public static void main(String args[])
    {
        flags obj = new flags();
        int arr[] = { 1, 3, 2, 5, 6, 7 };
        int n = arr.length;
        System.out.println(obj.checkIfAnyEven(arr, n));
        }
    }

