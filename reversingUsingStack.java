package com.br.javaPrractise.reverse;

import java.util.Stack;

public class reversingUsingStack {
    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        String Name="Azeez", ReverseNAme="";
        char[] ch=Name.toCharArray();
        for(int i=0;i<ch.length;i++){
            st.push(ch[i]);
        }
        while(!st.isEmpty()){
            ReverseNAme+=st.pop();
        }
        System.out.println(ReverseNAme);
    }
}
