package com.Ankur;

import java.util.Scanner;

public class CeilingOfNumber {
    //return index of smallest number that is >= target
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int arr[], int target) {
        // if the target element i greater than the largest element in the array then there is no ceiling
        if (target > arr[arr.length - 1])
            return -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return start;

    }
}
