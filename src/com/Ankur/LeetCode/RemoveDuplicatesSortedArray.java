package com.Ankur.LeetCode;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    //https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prev) {
                nums[count++] = nums[i];
                prev = nums[i];
            }
        }
        return count;
    }
}
