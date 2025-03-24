package com.br.javaPrractise.Streams;

import java.io.DataInputStream;
import java.io.IOException;

public class readingDataFromKeyboard {
     public static void main(String[] args) throws IOException {
         DataInputStream ne=new DataInputStream(System.in);
         int a=0;
         float b=0.0f;
         System.out.println("Enter the value of a");
         a=Integer.parseInt(ne.readLine());
         System.out.println("Enter the value of b");
         b=Float.valueOf(ne.readLine()).floatValue();
         System.out.println("The value of a is "+a);
         System.out.println("The value of b is "+b);
     }
}
