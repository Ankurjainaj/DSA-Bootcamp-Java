package com.Ankur.LeetCode.DailyProblem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDecreasingSubSequence {
    //https://leetcode.com/problems/non-decreasing-subsequences/
    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 7, 7};
        System.out.println(findSubsequences(arr));
    }

    static List<List<Integer>> response = new ArrayList<>();

    public static List<List<Integer>> findSubsequences(int[] nums) {
        subSeq(nums, 0, new ArrayList<>());
        return response;
    }

    private static void subSeq(int[] nums, int i, List<Integer> obj) {
        if (i > nums.length - 1) {
            if (obj.size() > 1)
                response.add(new ArrayList<>(obj));
            return;
        }
        if (obj.isEmpty() || nums[i] >= obj.get(obj.size() - 1)) {
            obj.add(nums[i]);
            subSeq(nums, i + 1, obj);
            obj.remove(obj.size() - 1);
        }
        if (i > 0 && !obj.isEmpty() && nums[i] == obj.get(obj.size() - 1))
            return;
        subSeq(nums, i + 1, obj);
    }
}
