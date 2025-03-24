package com.br.javaPrractise.String;

public class print_all_permutations_of_string {
    public static void main(String[] args) {
        String s = "cat";
        printallPermutns(s, "");
    }

    static void printallPermutns(String str, String str2)
    {
        if (str.length() == 0)
        {
            System.out.print(str2 + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            String str3 = str.substring(0, i) + str.substring(i + 1);
            printallPermutns(str3, str2 + ch);
        }
    }
}
