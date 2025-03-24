package com.br.javaPrractise.Character;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class frquency_of_Character {
    public static void main(String[] args) {
        String str = "Welcome to Java t point";

        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 't' || str.charAt(i) == 'T') {
                count++;
            }
        }
        System.out.println(str.substring(str.length()-3));
        int t_count=str.length()-str.replace("t","").length();
        System.out.println(t_count);
        System.out.println(count);
        //using collecti}\
//        for(int i=0;i<str.length();i++){
//            str.length()-str.replace(str.charAt(i),"").length();
//        }
    }
}
