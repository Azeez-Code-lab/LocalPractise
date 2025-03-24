package com.br.javaPrractise.Duplicates;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicatesFromString {
    public static void main(String[] args) {
        String str = "geeks for geeks";
        System.out.println(removeDuplicates(str));
    }
    public static String removeDuplicates(String str){
        Set<Character> set = new LinkedHashSet<>();
        for(char c:str.toCharArray()){
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c:set){
            sb.append(c);
        }
        return sb.toString();
    }
}
