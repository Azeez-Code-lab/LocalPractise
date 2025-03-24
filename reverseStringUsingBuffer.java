package com.br.javaPrractise.reverse;

import java.util.Collections;

public class reverseStringUsingBuffer {
    public static void main(String []args){
        String name="azeez";
        StringBuffer ns=new StringBuffer(name);
        StringBuilder sd=new StringBuilder(name);
        System.out.println(sd.reverse());
        System.out.println(ns.reverse());
    }
}
