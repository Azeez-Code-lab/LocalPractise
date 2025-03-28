package com.br.javaPrractise.Arrays;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;
        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> mySet = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();
        for (int num : arr1) {
            mySet.add(num);
        }
        for (int num : arr2) {
            int complement = target - num;
            if (mySet.contains(complement)) {
                pairs.add(new int[]{complement, num});
            }
        }
        return pairs;
    }
}
