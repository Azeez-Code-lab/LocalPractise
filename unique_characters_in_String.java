package com.br.javaPrractise.String;

import java.util.Arrays;

public class unique_characters_in_String {
    static final int MAX_CHAR = 256;
    public static void main(String[] args) {
        String s="String";
        for(int i=0;i<s.length();i++){
            int count=0,l=0;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count=1;
                }
            }
            if(count==0){
                System.out.println(s.charAt(i)+" is unique");
            }
            else{
                System.out.println(s.charAt(i)+" is not unique");

            }
        }

        String str = "GeeksforGeeks";
        printDistinct(str);



    }
    static void printDistinct(String str)
    {
        int n = str.length();
        int[] count = new int[MAX_CHAR];
        int[] index = new int[MAX_CHAR];


        for (int i = 0; i < MAX_CHAR; i++)
        {
            count[i] = 0;
            index[i] = n;
        }

        for (int i = 0; i < n; i++)
        {
            char x = str.charAt(i);
            ++count[x];

            if (count[x] == 1 && x !=' ')
                index[x] = i;

            if (count[x] == 2)
                index[x] = n;
        }


        Arrays.sort(index);
        for (int i = 0; i < MAX_CHAR && index[i] != n;
             i++)
            System.out.print(str.charAt(index[i]));
    }
}
