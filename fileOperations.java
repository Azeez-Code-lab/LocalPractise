package com.br.javaPrractise.Streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class fileOperations {
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
        String fileName=br.readLine();
        File fi=new File(fileName);
        System.out.println("File Name is:"+fi.getName());
        System.out.println("File Path is:"+fi.getPath());
        System.out.println("File Parent is:"+fi.getParent());
        System.out.println("File absolute path is:"+fi.getAbsolutePath());
        System.out.println("File Exist is:"+fi.exists());
        if(fi.exists()){
            System.out.println("File is writable:"+fi.canWrite());
            System.out.println("File canReadable:"+fi.canRead());
            System.out.println("File directory is in"+fi.isDirectory());
            System.out.println("File Length is:"+fi.length());
        }



    }
}
