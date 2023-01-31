package com.Ankur.LeetCode.DailyProblem;

public class SubArraySumsDivisibleByK {

    //https://leetcode.com/problems/subarray-sums-divisible-by-k/
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 0, -2, -3, 1};
        System.out.println(subarraysDivByK(arr, 5));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int[] arr = new int[k];
        arr[0] = 1;
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            int remainder = sum % k;
            if (remainder < 0) remainder += k;
            count += arr[remainder];
            arr[remainder]++;
        }
        return count;
    }
}
