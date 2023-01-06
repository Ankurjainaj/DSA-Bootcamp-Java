package com.Ankur.LeetCode.DailyProblem;

public class DeleteColumnsToMakeSorted {
    //https://leetcode.com/problems/delete-columns-to-make-sorted/

    public static void main(String[] args) {
        String[] s = new String[3];
        s[0] = "cba";
        s[1] = "daf";
        s[2] = "ghi";
        System.out.println(minDeletionSize(s));
    }

    public static int minDeletionSize(String[] strs) {
        int n = strs[0].length();
        int response = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    response++;
                    break;
                }
            }
        }
        return response;
    }
}
