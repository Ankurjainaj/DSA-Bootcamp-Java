package com.Ankur.LeetCode;

public class ClimbingStairs {
    //https://leetcode.com/problems/climbing-stairs
    static int[] steps = new int[46];

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        if (n == 2 || n == 1)
            return n;
        if (steps[n] == 0) {
            steps[n] = climbStairs(n - 1) + climbStairs(n - 2);
        }
        return steps[n];
    }
}
