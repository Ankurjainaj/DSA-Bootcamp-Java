package com.Ankur.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromPermutation {
    //https://leetcode.com/problems/build-array-from-permutation/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(newArray(arr)));
    }

    static int[] newArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
