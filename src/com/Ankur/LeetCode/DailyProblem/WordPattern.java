package com.Ankur.LeetCode.DailyProblem;

import java.util.HashMap;

public class WordPattern {
    //https://leetcode.com/problems/word-pattern/

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<String, String> hashtable = new HashMap<>();
        String[] s1 = s.split(" ");
        if (pattern.length() != s1.length)
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            String s2 = String.valueOf(pattern.charAt(i));
            if (hashtable.containsKey(s2) && !hashtable.get(s2).equals(s1[i]))
                return false;
            else if (hashtable.containsValue(s1[i]) && !hashtable.containsKey(s2))
                return false;
            else
                hashtable.put(s2, s1[i]);
        }
        return true;
    }
}
