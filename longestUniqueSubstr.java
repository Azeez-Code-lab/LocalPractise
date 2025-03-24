package com.br.javaPrractise.Leet_CodePractise;

import java.util.ArrayList;
import java.util.List;

public class longestUniqueSubstr {
    static int longestUniqueSubstr(String s) {
        int start=0,end=0,max_length=0;
        List<Character> list=new ArrayList<Character>();
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_length=Math.max(max_length,list.size());
            }
            else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(longestUniqueSubstr(s));
    }
}
