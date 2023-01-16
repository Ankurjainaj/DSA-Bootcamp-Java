package com.Ankur.LeetCode;

public class SingleNumber {
    //https://leetcode.com/problems/single-number/

    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 1, 1, 3};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums)
            a = a ^ i;
        return a;
    }
}
