package com.br.javaPrractise.Leet_CodePractise;

public class ZigZag {
    public static void main(String[] args) {
        String sentence="Palindrome";
        int n=3;
        System.out.println(new ZigZag().convert(sentence,n));

    }
    public String convert(String s,int numRows){
        String[] ans=new String[numRows];
        for(int i=0;i<numRows;i++){
            ans[i]="";
        }
        int i=0;
        while(i<s.length()){
            for(int index=0;index<numRows&&i<s.length();index++){
                ans[index]+=s.charAt(i++);
            }
            for(int index=numRows-2;index>0&&i<s.length();index--){
                ans[index]+=s.charAt(i++);
            }
        }
        String res="";
        for(String str:ans){
            res+=str;
        }
        return res;
    }
}
