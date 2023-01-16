package com.Ankur.LeetCode;

import java.util.Arrays;

public class RemoveElement {

    //https://leetcode.com/problems/remove-element/
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(arr, 3));
        System.out.println(Arrays.toString(arr));
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (val != nums[i]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
