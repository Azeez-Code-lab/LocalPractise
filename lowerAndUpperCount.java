package com.br.javaPrractise.String;

public class lowerAndUpperCount {
    public static void main(String args[]){
        int  lCaseCount = 0, uCaseCount = 0, numbersCount = 0, sCharCount = 0;
        String s = "Welcome To JAVA Clas @ 12345";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                uCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lCaseCount++;
            }else if(Character.isDigit(ch)){
                numbersCount++;
            }else{
                sCharCount++;
            }
        }
        System.out.println("Upper Case Count: " + uCaseCount);
        System.out.println("Lower Case Count: " + lCaseCount);
        System.out.println("Numbers Count: " + numbersCount);
        System.out.println("Special Characters Count: " + sCharCount);

    }
}
