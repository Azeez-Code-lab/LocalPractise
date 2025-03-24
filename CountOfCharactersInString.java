package com.br.javaPrractise.Count;
import io.cucumber.java.sl.In;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfCharactersInString {
    public static void main(String[] args) {
        String s = "vengatram";
        HashMap<Character, Integer> emp = new HashMap<Character,
                Integer>();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (emp.containsKey(c)) {
                int x = emp.get(c);
                emp.put(c, x + 1);
            } else {
                emp.put(c, 1);
            }
        }
        System.out.println(emp);


        String sentence="I Love India I Love India";
        HashMap<String, Integer>dh=new HashMap<>();
        String[] strarr=sentence.split(" ");
        for(String strar:strarr){
            if(dh.containsKey(strar)){
                int y=dh.get(strar);
                dh.put(strar,y+1);
            }
            else{
                dh.put(strar,1);
            }
        }
        System.out.println(dh);
        List<String> li= Arrays.asList(strarr);
        Set<String> se=new HashSet<>(li);
        for(String sh:se){
            System.out.println("The Frequency of the "+sh+" is "+Collections.frequency(li,sh));
        }
        li.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }

}
