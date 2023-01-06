package com.Ankur.LeetCode.DailyProblem;

public class DetectCapital {
    //https://leetcode.com/problems/detect-capital/
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("Leetcode"));
    }

    public static boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }
}
