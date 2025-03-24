package com.br.javaPrractise.Streams;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String args[]) throws IOException {
        String str="This is the book on java"+"/nIam a leaner of java";
        FileWriter nt=new FileWriter("Textname");
        for(int i=0;i<str.length();i++){
            nt.write(str.charAt(i));
        }
        nt.close();
    }
}
