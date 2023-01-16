package com.Ankur.LeetCode;

public class LengthOfLastWord {
    //https://leetcode.com/problems/length-of-last-word/
    //https://leetcode.com/problems/add-binary/

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
                , "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
        ));
    }

    public static int lengthOfLastWord(String s) {
        String[] s1 = s.trim().split(" ");
        return s1[s1.length - 1].length();
    }

    public static String addBinary(String a, String b) {
//        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
        StringBuilder response = new StringBuilder();
        int len1 = a.length();
        int len2 = b.length();
        int i = len1 - 1;
        int j = len2 - 1;
        int decimal = 0;
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        while (i >= 0 || j >= 0 || decimal == 1) {
            decimal = decimal + ((i >= 0) ? charsA[i] - '0' : 0);
            decimal = decimal + ((j >= 0) ? charsB[j] - '0' : 0);
            response.insert(0, (char) (decimal % 2 + '0'));
            decimal = decimal / 2;
            i--;
            j--;
        }
        return response.toString();
    }
}
