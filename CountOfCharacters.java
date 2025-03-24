package com.br.javaPrractise.Count;

public class CountOfCharacters {
    public static void main(String[] args) {
        String st="Welcome To JAVA Clas @ 12345";
        int nCount=0,lCount=0,uCount=0,spCount=0;

        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(Character.isUpperCase(ch)){
                uCount++;
            }
            if(Character.isLowerCase(ch)){
                lCount++;
            }
            if(Character.isDigit(ch)){
                nCount++;
            }
            else{
                spCount++;
            }
        }
        System.out.println("Upper Case Count: " + uCount);
        System.out.println("Lower Case Count: " + lCount);
        System.out.println("Numbers Count: " + nCount);
        System.out.println("Special Characters Count: " + spCount);

        String name="NavadeepPutra";
        char[] nn=name.toCharArray();
        System.out.println(nn.length);
    }
}
