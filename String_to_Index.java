package com.br.javaPrractise.Leet_CodePractise;

import io.cucumber.java.sl.In;

public class String_to_Index {
    public static void main(String[] args) {
        String num=" -12345";
        System.out.print(new String_to_Index().myAtoi(num));

    }
    public int myAtoi(String s){
        int index=0,total=0,sign=1;
        if(s.length()==0)return 0;
        while(index<s.length()&&s.charAt(index)==' ')index++;
        if(index==s.length())return 0;
        if(s.charAt(index)=='+'||s.charAt(index)=='-'){
            sign=s.charAt(index)=='+'?1:-1;
            index++;
        }
        while(index<s.length()){
            int digit=s.charAt(index)-'0';
            if(digit<0 || digit>9)break;
            if(Integer.MAX_VALUE/10<total||Integer.MIN_VALUE/10==total&&Integer.MIN_VALUE%10<digit)
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            total=total*10+digit;
            index++;
        }
        return total*sign;
    }
}
