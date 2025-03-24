package com.br.javaPrractise.Arrays;

public class two_dimensional {
    //final static int rows=10;
    //final static int col=20;
    public static void main(String []args){
        int rows=10,col=20;
        int [][]product=new int[rows][col];
        System.out.println("Multiplication table");
        System.out.println(" ");
        int i,j;
        for(i=10;i<=rows;i++){
            for(j=10;j<col;j++){
                product[i][j]=i*j;
                System.out.println(" "+product[i][j]);
            }
            System.out.println(" ");
        }
    }
}
