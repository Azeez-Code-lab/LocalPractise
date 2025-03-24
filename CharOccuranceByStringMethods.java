package com.br.javaPrractise.String;

public class CharOccuranceByStringMethods {
    public static void main(String[] args) {
        String str="javaisanobjectorientedLanguage";
        String result = "";
        char[] ch=str.toCharArray();
        for(int i=0;i<str.length();i++){
            String chr="";
            int count = 1;
            for(int j=i+1;j<str.length()-1;j++){
                if(ch[i]==ch[j]){
                    count++;
                }
            }
            if (!(result.contains(Character.toString(str.charAt(i))))) {
                result += str.charAt(i)+" : " + count+" ";
                chr=str.charAt(i)+" : " + count+" ";
                System.out.println(chr);
            }

        }
        int result1=str.length()-str.replace("a","").length();
        System.out.println(result1);
    }
}
