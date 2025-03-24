package com.br.javaPrractise.Count;

import java.util.*;

public class countOfDuplicateStringsInSentence {
    public static void main(String[] args) {
        List<String> ss=new ArrayList<>();
        ss.add("Azeez");
        ss.add("Raj");
        ss.add("Venkat");
        ss.add("Azeez");
        ss.add("Raj");
        ss.add("Venkat");
        Set<String> tt=new HashSet<>(ss);
        for(String kk:tt){
            System.out.println("the frequency of "+kk+" is "+ Collections.frequency(ss,kk));
        }
        System.out.println(Collections.max(ss));
        Set<Integer> vy=new TreeSet<>();
        vy.add(33);
        vy.add(133);
        vy.add(533);
        vy.add(333);
        vy.add(433);
        vy.add(233);
        vy.add(633);
        System.out.println(vy);

    }
}
