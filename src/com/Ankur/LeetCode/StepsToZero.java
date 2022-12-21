package com.Ankur.LeetCode;

public class StepsToZero {
    //https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
    public static void main(String[] args) {
        System.out.println(numberOfSteps(234234234));
    }

    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    static int helper(int n, int step) {
        if (n == 0)
            return step;
        if (n % 2 == 0)
            return helper(n / 2, step + 1);
        else
            return helper(n - 1, step + 1);
    }
}
