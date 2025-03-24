package com.br.javaPrractise.Streams;

import java.io.*;

public class inputtingData {
    public static void main(String args[]) throws IOException {
        //to accept the filename from keyboard
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the file name :");
        String fname=br.readLine();
        //attching file to FileInputStream
        FileInputStream io;
        try{
            io=new FileInputStream(fname);
        }
        catch (FileNotFoundException fe){
            System.out.println("File not found");
            return;
        }
        BufferedInputStream bin=new BufferedInputStream(io);
        System.out.println("File contents");
        int ch;
        while((ch=io.read())!=-1)
            System.out.println((char)ch);
        bin.close();

    }
}
