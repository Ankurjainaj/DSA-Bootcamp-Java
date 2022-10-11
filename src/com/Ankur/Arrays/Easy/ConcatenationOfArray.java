package com.Ankur.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
    //https://leetcode.com/problems/concatenation-of-array/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(concatArray(arr)));
    }

    static int[] concatArray(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % nums.length];
        }
        return ans;
    }
}
