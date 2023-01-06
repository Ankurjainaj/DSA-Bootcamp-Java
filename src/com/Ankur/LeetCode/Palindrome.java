package com.Ankur.LeetCode;

public class Palindrome {
    //https://leetcode.com/problems/palindrome-number/

    public static void main(String[] args) {
    }

    public static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        String a = sb.toString();
        return a.equals(sb.reverse().toString());
    }
}
