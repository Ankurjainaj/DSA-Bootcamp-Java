package com.Ankur.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
    //https://leetcode.com/problems/shuffle-the-array/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int k = 0;
        for (int i = 0; i < n; i++) {

            ans[k] = nums[i];
            k++;
            ans[k] = nums[i + n];
            k++;
        }
        return ans;
    }
}
