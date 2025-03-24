package com.br.javaPrractise.Streams;

import java.io.*;

public class fileCopy {
    public static void main(String args[]) throws IOException {
        int ch;
        FileInputStream intp=new FileInputStream("myfile.txt");
        FileOutputStream outp=new FileOutputStream("text.txt");
        while((ch=intp.read())!=-1){
            outp.write(ch);
        }
        intp.close();
        outp.close();
    }
}
