package com.Ankur.DailyDataStructure;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (final int num : nums)
            if (!seen.add(num))
                return true;
        return false;
    }
}
