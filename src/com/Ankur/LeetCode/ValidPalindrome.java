package com.Ankur.LeetCode;

public class ValidPalindrome {
    //https://leetcode.com/problems/valid-palindrome/
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isDigit(c))
                sb.append(c);
        }
        return sb.toString().equals(sb.reverse().toString());

    }
}
