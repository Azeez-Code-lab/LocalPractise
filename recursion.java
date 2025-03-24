package com.br.javaPrractise.recursion;

public class recursion {
    public static void main(String args[]){
        recursion rec=new recursion();
        callMySelf(10);

    }
    public static void callMySelf(int i) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        i-=1;
        callMySelf(i);
    }

}
