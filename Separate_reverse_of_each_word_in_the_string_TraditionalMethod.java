package com.br.javaPrractise.reverse;

public class Separate_reverse_of_each_word_in_the_string_TraditionalMethod {
    public static void main(String args[]){
        String greetings="Hai Good Morning and I really love you so much",reverseGreet="";
        String greetArray[]=greetings.split(" ");
        for(int i=0;i<greetArray.length;i++){
            String t = greetArray[i];
            System.out.println("The Length of "+i+" word "+t.length());
            for(int j=t.length()-1;j>=0;j--){
                char ch=t.charAt(j);
                reverseGreet+=ch;
            }
            reverseGreet+=" ";
        }
        System.out.println(reverseGreet);

    }
}
