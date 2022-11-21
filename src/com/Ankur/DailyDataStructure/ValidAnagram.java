package com.Ankur.DailyDataStructure;

import java.util.Scanner;

public class ValidAnagram {
    //https://leetcode.com/problems/valid-anagram/?envType=study-plan&id=data-structure-i
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        int[] charCount = new int[26];

        for (char ch : s.toCharArray())
            charCount[ch - 'a']++;
        for (char ch : t.toCharArray())
            charCount[ch - 'a']--;
        for (int i = 0; i < 26; i++)
            if (charCount[i] != 0) return false;
        return true;
    }
}
