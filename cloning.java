package com.br.javaPrractise.Arrays;

import java.util.HashMap;
import java.util.Map;

public class cloning {
    public static void main(String args[]){
        int ai[] = {1, 2, 3, 4, 5};
        int aic[] = ai;
        System.out.println(aic[2]);
        System.out.println(ai[2]);
        System.out.println("---");
        aic = ai.clone();
        System.out.println(ai);
        //System.out.println(ai[1]);
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
