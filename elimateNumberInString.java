package com.br.javaPrractise.String;

public class elimateNumberInString {
    public static void main(String[] args) {
        String st="sub53od73th";
//        char[] ch=st.toCharArray();
//        int length=ch.length,i = 0;
        StringBuilder sb=new StringBuilder();
//        while(i<length){
//            if(Character.isDigit(ch[i])){
//                i++;
//            }
//            else{
//                sb.append(ch[i]);
//                i++;
//            }
//        }
//        System.out.println(sb);
        for(int j=0;j<st.length();j++){
            if(Character.isDigit(st.charAt(j))){
                System.out.println(st.charAt(j));
            }
            else{
                sb.append(st.charAt(j));
            }
        }
        System.out.println(sb);
    }
}
