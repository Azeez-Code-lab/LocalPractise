package com.br.javaPrractise.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBufferex {
    public static void main(String args[]) throws IOException {
        StringBuffer ds=new StringBuffer();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter surename");
        String sur=br.readLine();
        System.out.println("Enter MidName");
        String midname=br.readLine();
        System.out.println("Enter lastname");
        String lastname=br.readLine();
        ds.append(sur);
        ds.append(lastname);
        System.out.println("Name = "+ds);
        int n=sur.length();
        ds.insert(n,midname);
        int k=sur.length();
        ds.insert(n," ");
        System.out.println("Fullname is" +ds);
        System.out.println("Revername is :"+ds.reverse());



    }

}
