package com.Ankur.Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class HouseRobber {
    //https://leetcode.com/problems/house-robber/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(rob(arr, arr.length - 1));
        System.out.println(rob3(arr));
    }

    static int rob1(int[] arr) {
        if (arr.length == 0)
            return 0;
        int[] memo = new int[arr.length + 1];
        memo[0] = 0;
        memo[1] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int v = arr[i];
            memo[i + 1] = Math.max(memo[i], memo[i - 1] + v);
        }
        return memo[arr.length];
    }

    /* the order is: prev2, prev1, num  */
    public static int rob3(int[] nums) {
        if (nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        for (int num : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = tmp;
        }
        return prev1;
    }

    static int[] memo;

    static int rob(int[] nums) {
        memo = new int[nums.length + 1];
        Arrays.fill(memo, -1);
        return rob(nums, nums.length - 1);
    }

    static int rob(int[] arr, int i) {
        if (i < 0) {
            return 0;
        }
        if (memo[i] > 0)
            return memo[i];
        int ans = Math.max(rob(arr, i - 2) + arr[i], rob(arr, i - 1));
        memo[i] = ans;
        return ans;
    }
}
