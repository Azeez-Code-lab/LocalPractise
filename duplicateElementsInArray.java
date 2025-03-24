package com.br.javaPrractise.Arrays;

import java.util.*;

public class duplicateElementsInArray {
    public static void main(String[] args) {
        Integer[] a={1,1,1,2,2,3,4,4,5,3,5,7};
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    System.out.println(a[i]);
                }
            }
        }
        System.out.println(count);

       List<Integer> ar= Arrays.asList(a);
//        Map<Integer,Integer> mp=new HashMap();
//        for(int i=0;i<ar.size();i++){
//            if(mp.containsKey(ar.get(i))){
//                int x=mp.get(i);
//                mp.put(i,x);
//            }
//            else{
//                mp.put(i,1);
//            }
//        }
//        System.out.println(mp);

        Set<Integer> se=new HashSet<>(ar);
        for(int temp:se){
            System.out.println("The Frequency of "+temp+" is "+Collections.frequency(ar,temp));
        }

        Collections.sort(ar);
        System.out.println(ar);
    }
}
