package com.br.javaPrractise.TargetHundred;

public class sumOfOddAndEven {
    public static void main(String args[]){
        int OddSum=0, EvenSum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                EvenSum++;
            }else{
                OddSum++;
            }
        }
        System.out.println("Sum of Odd Numbers is" +OddSum);
        System.out.println("Sum of Even Numbers is" +EvenSum);
    }
}
