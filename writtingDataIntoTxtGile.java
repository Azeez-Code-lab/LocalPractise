package com.br.javaPrractise.TargetHundred;

import java.io.FileOutputStream;

public class writtingDataIntoTxtGile {
    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("C:\\Users\\ShaikAze\\IdeaProjects\\selenium-training\\Textname");
            fout.write(67);
            fout.close();
            System.out.println("success.. by Technolamror.");
        }catch(Exception e){System.out.println(e);}
    }
}
