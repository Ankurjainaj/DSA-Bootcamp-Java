package com.Ankur.Arrays.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SmallerNumbersThanCurrent {
    //https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(smallerNumbersThanCurrent1(arr)));
    }

    //Worst Case  O(n^2)
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (nums[i] > num)
                    count++;
            }
            ans[i] = count;
        }
        return ans;
    }

    //Best Case  O(nlog(n))
    public static int[] smallerNumbersThanCurrent1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] helper = nums.clone();
        Arrays.sort(helper);        //O(nlog(n))
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(helper[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            helper[i] = map.get(nums[i]);
        }
        return helper;
    }
}
