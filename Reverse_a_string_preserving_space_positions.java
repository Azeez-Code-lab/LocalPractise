package com.br.javaPrractise.String;

public class Reverse_a_string_preserving_space_positions {
    public static void main(String[] args) {
        String name="Azeez is a Automation Test Engineer";
        reverses(name);
    }
    public static void reverses(String value){
        char[] inputArray=value.toCharArray();
        char[] result=new char[inputArray.length];

        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]==' '){
                result[i]=' ';
            }
        }

        int j=result.length-1;
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]!=' '){
                if(result[j]==' '){
                    j--;
                }
                result[j]=inputArray[i];
                j--;
            }
        }
        System.out.println(String.valueOf(result));
    }
}
