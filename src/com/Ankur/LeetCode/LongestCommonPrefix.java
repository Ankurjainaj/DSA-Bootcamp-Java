package com.Ankur.LeetCode;

public class LongestCommonPrefix {
    //https://leetcode.com/problems/longest-common-prefix

    public static void main(String[] args) {
        String[] arr = new String[]{"flow", "flyer", "flower"};
        System.out.println(longestCommonPrefix(arr));
        System.out.println(longestPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder s = new StringBuilder();
        int k = 0;
        if (strs[0].isBlank())
            return "";
        for (int i = 0; i < strs[0].length(); i++) {
            s.append(strs[0].charAt(k));
            k++;
            int notMatch = 0;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].startsWith(s.toString()))
                    continue;
                else {
                    notMatch++;
                }
            }
            if (notMatch != 0) {
                s.deleteCharAt(s.length() - 1);
                break;
            }
        }
        return s.toString();
    }

    public static String longestPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
            }
            if (result.equals("")) {
                return result;
            }
        }
        return result;
    }
}
