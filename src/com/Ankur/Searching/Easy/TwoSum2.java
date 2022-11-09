package com.Ankur.Searching.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] arr, int target) {
        int[] response = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            int a = search(arr, target - arr[i], i + 1);
            if (a != -1) {
                response[0] = i;
                response[1] = a;
            }
        }
        return response;
    }

    private static int search(int[] arr, int target, int j) {
        int start = j;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] > target)
                end = mid - 1;
            if (arr[mid] < target)
                start = mid + 1;
        }
        return -1;
    }

    public static int[] twoSum2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int a = arr[end] + arr[start];
            if (a == target) {
                return new int[]{start + 1, end + 1};
            }
            if (a > target)
                end--;
            if (a < target)
                start++;
        }
        return null;
    }
}
