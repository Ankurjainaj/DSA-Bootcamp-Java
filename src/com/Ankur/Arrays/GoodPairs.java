package com.Ankur.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GoodPairs {
    //https://leetcode.com/problems/number-of-good-pairs/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(num2(arr));
    }

    public static int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    pairs++;
            }
        }
        return pairs;
    }

    public static int num2(int[] nums) {
        HashMap<Integer, ArrayList> map = new HashMap<>();

        int c = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int value = nums[i];
            if (map.get(value) != null) {
                ArrayList<Integer> ar = map.get(value);
                c += ar.get(0) - ar.get(1);
                ar.set(1, ar.get(1) + 1);
            } else {
                int k = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (value == nums[j]) {
                        k++;
                    }
                }
                c += k;
                ArrayList<Integer> ar = new ArrayList<>();
                ar.add(k);
                ar.add(1);
                map.put(value, ar);
            }
        }
        return c;
    }
}
