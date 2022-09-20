package com.Ankur.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PangramSentence {
    //https://leetcode.com/problems/check-if-the-sentence-is-pangram/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(checkIfPangram1(s));
    }

    public static boolean checkIfPangram(String sentence) {
        Map<String, Integer> pangram = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            pangram.put(String.valueOf(sentence.charAt(i)), 1);
        }
        return pangram.keySet().size() == 26;
    }

    //Faster solution
    public static boolean checkIfPangram1(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 26; i++) {
            if (sentence.indexOf(alphabet.charAt(i)) == -1)
                return false;
        }
        return true;
    }

}
