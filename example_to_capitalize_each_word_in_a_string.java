package com.br.javaPrractise.String;

public class example_to_capitalize_each_word_in_a_string {
    public static void main(String[] args) {
        example_to_capitalize_each_word_in_a_string ds=new example_to_capitalize_each_word_in_a_string();
        System.out.println(ds.conversion("hi good morning"));
    }
    public String conversion(String str) {
        String words[] = str.split("\\s");
        String captialConversion = "";
        for (String w : words) {
            String firstString = w.substring(0,1);
            String secondString = w.substring(1);
            captialConversion+= firstString.toUpperCase()+secondString+" ";
        }

        return captialConversion.trim();
    }
}
