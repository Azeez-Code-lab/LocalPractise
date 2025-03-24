package com.br.javaPrractise.Arrays;

import java.util.*;

import static org.apache.commons.lang3.stream.Streams.stream;

public class arrayListDuplication {
    public static void main(String args[]){
        int count=0;
        ArrayList<String> list=new ArrayList();
        list.add("Sagio Mane");
        list.add("Karius");
        list.add("Mo Salah");
        list.add("Firmino");
        list.add("Lovren");
        list.add("Steven Gerrard");
        list.add("Karius");
        list.add("Mo Salah");
        Set<String> s = new HashSet<String>();
        for(String name : list) {
            if(s.add(name) == false)
                count++;
        }
        Iterator<String> it= s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //System.out.println(count);
        Set<String> k=new HashSet<>(list);
        //System.out.println(k);
        //list.stream().distinct().forEach(n->System.out.print(n));
    }
}
