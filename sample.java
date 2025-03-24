package com.br.javaPrractise;

public class sample {
    public String Name="Tom";
     String getName(String Names)
    {
        Name=Names;
        System.out.println(Name);
        return Name;
    }
    public static void main(String args[]){
        sample se=new sample();
        se.getName("Azeez");
    }
}
