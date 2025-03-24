package com.br.javaPrractise.Duplicates;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        String para="I had worked Hard But I hadn't got my reward";
        String[] se=para.split(" ");
        List<String> cd=new ArrayList<String>();
        for(String e:se){
            cd.add(e);
        }
        Set<String> df=new HashSet<>(cd);
        for(String temp:df){
            System.out.println(temp+"  :  "+ Collections.frequency(cd,temp));
        }
        Map<String, Long> mp=  cd.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mp);
    }
}
