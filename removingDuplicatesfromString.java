package com.br.javaPrractise.Duplicates;

public class removingDuplicatesfromString {
    public static void main(String[] args) {
        String name="Azeez";
        StringBuilder sb=new StringBuilder(name.length());
        boolean[] seen=new boolean[256];
        char[] ch=name.toCharArray();
        for(char c:ch){
            if(!seen[c]){
                sb.append(c);
                seen[c] = true;
            }
        }
        System.out.println(sb);
    }
}
