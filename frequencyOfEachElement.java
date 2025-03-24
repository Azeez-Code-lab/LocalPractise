package com.br.javaPrractise.Arrays;

import java.util.*;

public class frequencyOfEachElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] fr = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
        System.out.println("----------------------------------------");
 //----------------------------------------------------------------------------------------
        List<Integer> li= new ArrayList<>();
        for(int ar:arr){
            li.add(ar);
        }

        Set si=new HashSet<Integer>(li);
        for(int sr:li){
            si.add(sr);
        }
        for(Object temp:si){
            System.out.println("The Frequency of "+temp+" is "+Collections.frequency(li,temp));
        }

    }
}
