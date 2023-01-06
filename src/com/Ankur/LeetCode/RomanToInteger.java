package com.Ankur.LeetCode;

import java.util.HashMap;

public class RomanToInteger {
    //https://leetcode.com/problems/roman-to-integer/
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int response = 0;
        for (int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
            String str1 = null;
            if (i + 1 < s.length())
                str1 = String.valueOf(s.charAt(i + 1));
            if (str.equals("I") && str1 != null) {
                if (str1.equals("V")) {
                    response += 4;
                    i++;
                    continue;
                }
                if (str1.equals("X")) {
                    response += 9;
                    i++;
                    continue;
                }
            }
            if (str.equals("X") && str1 != null) {
                if (str1.equals("L")) {
                    response += 40;
                    i++;
                    continue;
                }
                if (str1.equals("C")) {
                    response += 90;
                    i++;
                    continue;
                }
            }
            if (str.equals("C") && str1 != null) {
                if (str1.equals("D")) {
                    response += 400;
                    i++;
                    continue;
                }
                if (str1.equals("M")) {
                    response += 900;
                    i++;
                    continue;
                }
            }
            response += map.get(str);
        }
        return response;
    }
}
