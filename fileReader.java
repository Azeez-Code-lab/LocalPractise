package com.br.javaPrractise.Streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class fileReader {
   public static void main(String args[]) throws IOException {
//        int ch;
//        FileReader fr=null;
//        try{
//            fr=new FileReader("C:\\Users\\ShaikAze\\IdeaProjects\\selenium-training\\myfile.txt");
//        }
//        catch (FileNotFoundException fe)
//        {
//            System.out.println("File not found");
//            return;
//        }
//        while((ch=fr.read())!=-1)
//            System.out.println((char) ch);
//            fr.close();

       Path fileName = Path.of("C:\\Users\\ShaikAze\\IdeaProjects\\selenium-training\\myfile.txt");
       String str = Files.readString(fileName);
       System.out.println(str);

   }
}
