package com.Ankur.LeetCode.DailyProblem;

public class TribonacciNumber {
    //https://leetcode.com/problems/n-th-tribonacci-number/

    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }

    static int[] arr = new int[37];

    public static int tribonacci(int n) {
        if (n == 0) return 0;
        else if (n <= 2) return 1;
        if (arr[n] == 0)
            arr[n] = tribonacci(n - 3) + tribonacci(n - 1) + tribonacci(n - 2);
        return arr[n];
    }
}
