package com.Ankur.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    //https://leetcode.com/problems/running-sum-of-1d-array/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + temp;
            temp = nums[i];
        }
        return nums;
    }
}
