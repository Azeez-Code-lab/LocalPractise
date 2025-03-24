package com.br.javaPrractise.Streams;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class pdfReader {
    public void givenSamplePdf_whenUsingApachePdfBox_thenCompareOutput() throws IOException {
        String expectedText = "Hello World!\n";
        File file = new File("C:\\Users\\ShaikAze\\IdeaProjects\\selenium-training\\target\\susheel.pdf");
        PDDocument document = PDDocument.load(file);
        PDFTextStripper stripper = new PDFTextStripper();
        String text = stripper.getText(document);
        Boolean val=text.contains("Susheel Chebrolu");
        System.out.println(text);
        document.close();
       // assertEquals(expectedText, text);
    }
    public static void main(String args[]) throws IOException {
        pdfReader cl=new pdfReader();
        cl.givenSamplePdf_whenUsingApachePdfBox_thenCompareOutput();
    }
}
