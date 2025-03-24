package com.br.javaPrractise.Leet_CodePractise;

import java.util.ArrayList;
import java.util.List;

public class WordSubSet {
    public static void main(String[] args) {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"lo","eo"};
        List<String> jjj=new ArrayList<>();

        for(int i=0;i<words1.length;i++){
            for(int j=0;j<words2.length-1;j++){
                if(words1[i].contains(words2[j])&&words1[i].contains(words2[j+1])){
                    jjj.add(words1[i]);
                }
                else{
                    break;
                }
            }
        }
        System.out.println(jjj);
    }
}
