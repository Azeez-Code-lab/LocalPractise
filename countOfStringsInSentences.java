package com.br.javaPrractise.Count;

import java.util.HashMap;

public class countOfStringsInSentences {
    public static void main(String[] args) {
        String sentences="My name is name is";
        String []kk=sentences.split(" ");
        HashMap<String,Integer>tt=new HashMap<String,Integer>();
        for(String ss:kk){
            if(tt.containsKey(ss)){
                int x=tt.get(ss);
                tt.put(ss,x+1);
            }
            else{
                tt.put(ss,1);
            }
        }
        System.out.println(tt);
    }
}
