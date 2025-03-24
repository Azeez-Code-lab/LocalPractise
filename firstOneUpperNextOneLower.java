package com.br.javaPrractise.String;

public class firstOneUpperNextOneLower {
    public static void main(String[] args) {
        String st="Azeez";
        StringBuffer cv=new StringBuffer();
        char[] ch=st.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(i%2==0 && st.charAt(i)!=' '){
                cv.append(Character.toUpperCase(st.charAt(i)));
            }
            else{
                cv.append(st.charAt(i));
            }
        }
        System.out.println(cv);
    }
}
