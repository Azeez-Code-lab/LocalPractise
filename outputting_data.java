package com.br.javaPrractise.Streams;

import java.io.*;

public class outputting_data {
    //read data from the keyboard and write it to the file
    public static void main(String args[]) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        //true is written to maintain the data everytime without deleting after every execution
        FileOutputStream fout = new FileOutputStream("myfile.txt", true);

        BufferedOutputStream bout = new BufferedOutputStream(fout, 1024);
        System.out.println("Enter text (@ at the end): ");
        char ch;
        while ((ch = (char) dis.read()) != '@'){
            bout.write(ch);
    }
            bout.close();


    }
}
