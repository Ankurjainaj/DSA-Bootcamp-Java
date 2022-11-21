package com.Ankur.DailyDataStructure;

import java.util.Scanner;

public class RansomNote {
    //https://leetcode.com/problems/ransom-note/?envType=study-plan&id=data-structure-i
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ransom = in.next();
        String mag = in.next();
        System.out.println(canConstruct(ransom, mag));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length())
            return false;
        for (int i = 0; i < ransomNote.length(); i++) {
            if (magazine.contains(String.valueOf(ransomNote.charAt(i)))) {
                magazine = magazine.replaceFirst(String.valueOf(ransomNote.charAt(i)), "");
            } else
                return false;
        }
        return true;
    }

    public static boolean canConstruct1(String ransom, String magazine) {
        if (ransom.length() > magazine.length()) return false;
        int[] charIndexes = new int[26];
        int magIndex = 0;
        for (char car : ransom.toCharArray()) {

            magIndex = magazine.indexOf(car, charIndexes[car - 'a']);

            if (magIndex == -1) return false;

            charIndexes[car - 'a'] = magIndex + 1;
        }
        return true;
    }
}
