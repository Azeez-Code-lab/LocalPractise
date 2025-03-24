package com.br.javaPrractise.Duplicates;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findingDuplicatesFromListUsingSet {
    public static void main(String[] args) {
        List<String> tf=new ArrayList<String>();
        tf.add("Azeez");
        tf.add("Azeez");
        tf.add("Ravi");
        tf.add("Sunil");
        tf.add("Siva");
        tf.add("Azeez");
        tf.add("Irin");
        findDuplicates(tf);

    }
    public static Set<String> findDuplicates(List<String>tf){
        Set<String> set1=new HashSet<String>();
        Set<String> set2=new HashSet<String>();
        for(String str:tf){
            if(!set1.add(str)){
                set2.add(str);
            }
        }
        System.out.println(set2);
        System.out.println(set1);
        return (set2);
    }
}
