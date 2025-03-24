package com.br.javaPrractise.String;

import java.util.Vector;

public class Vectors {
    public static void main(String []args){
        Vector<Integer> vect=new Vector<Integer>();
        vect.add(3);
        vect.add(45);
        vect.add(33);
        vect.add(35);
        vect.add(53);
        vect.add(65);
        vect.add(3);
        vect.add(45);
        vect.add(33);
        vect.add(35);
        vect.add(53);
        vect.add(65);
        System.out.println("The capasity of vector is" +vect.capacity());
        for(int i:vect){
            System.out.println(i);
        }
    }
}
