package com.Ankur.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TargetArray {
    //https://leetcode.com/problems/create-target-array-in-the-given-order/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int t = in.nextInt();
        int[] index = new int[n];
        for (int i = 0; i < t; i++) {
            index[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(createTargetArray(nums, index)));

    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
