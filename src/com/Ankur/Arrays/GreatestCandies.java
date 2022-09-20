package com.Ankur.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestCandies {
    //https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int extraCandies = in.nextInt();
        System.out.println(kidsWithCandies(arr, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maxValue = findMax(candies);
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxValue)
                ans.add(i, true);
            else
                ans.add(i, false);
        }
        return ans;
    }

    static int findMax(int[] candies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max)
                max = candies[i];
        }
        return max;
    }
}
