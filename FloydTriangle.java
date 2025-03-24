package com.br.javaPrractise.Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class FloydTriangle {
    public static void main(String args[]) throws IOException {
        int i, j,k=1,arr[]={1,2,3,4};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sur = Integer.parseInt(br.readLine());
        for (i = 1; i <= sur; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println("");
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

    }
}

