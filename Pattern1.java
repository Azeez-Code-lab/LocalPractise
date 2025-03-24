package com.br.javaPrractise.Numbers;

public class Pattern1 {
    public static void main(String args[]){
        int num = 7,i,j;
        String pull="";
        for(i=1;i<num;i++){
                String a= String.valueOf(i);
                pull+=a;
            System.out.println(" *" + " " +pull);
        }
    }
}
