package com.br.javaPrractise.Numbers;

import java.util.Random;

public class randomNumberGeneration {
    public static void main(String args[]){
        Random rand = new Random();
        int r1 = rand.nextInt(1000);
        System.out.println("Random numbers: "+ r1);
    }
}
