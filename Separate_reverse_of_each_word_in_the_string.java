package com.br.javaPrractise.reverse;

public class Separate_reverse_of_each_word_in_the_string {
    public static void main(String args[]){
        Separate_reverse_of_each_word_in_the_string kk=new Separate_reverse_of_each_word_in_the_string();
        System.out.println(kk.reverseWord("my name is khan"));
    }
    public static String reverseWord(String str){
        String arr[]=str.split("\\s");
        String correctName="";
        for(String w:arr){
            StringBuilder sd=new StringBuilder(w);
            sd.reverse();
            correctName+=sd.toString()+" ";
        }
        return correctName.trim();
    }
}
