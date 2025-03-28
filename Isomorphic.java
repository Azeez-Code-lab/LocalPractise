package com.br.javaPrractise.Leet_CodePractise;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("abc", "xyz") ? "True" : "False");
    }

    public static boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        for (int i = 0; i < s1.length(); ++i) {
            if (!m1.containsKey(s1.charAt(i))) {
                m1.put(s1.charAt(i), i);
            }
            if (!m2.containsKey(s2.charAt(i))) {
                m2.put(s2.charAt(i), i);
            }
            if (!m1.get(s1.charAt(i)).equals(m2.get(s2.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

}
