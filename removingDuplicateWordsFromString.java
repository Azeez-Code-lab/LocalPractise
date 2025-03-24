package com.br.javaPrractise.Duplicates;

public class removingDuplicateWordsFromString {
    public static void main(String[] args) {
        String input="Azeez is a Automation tester";
        String[] s=input.split("");
        for(int i=0;i<s.length;i++){
            if(s[i]!=null){
                for(int j=i+1;j<s.length;j++){
                    if(s[i].equals(s[j])){
                        s[j]=null;
                    }
                }
            }
        }

        for(int i=0;i<s.length;i++){
            if(s[i]!=null){
                System.out.print(s[i]);
            }
        }
    }
}
