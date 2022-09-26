package com.Ankur;

import java.util.Scanner;

public class RotationSortedArrayRotationCount {
    //GFG
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(findPivot(arr) + 1);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return -1;
    }

    //Use this if the array contains duplicate elements
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            //if elements at the start, end and mid are duplicates then skip them
            if (arr[mid] == arr[start] && arr[end] == arr[mid]) {
                //Check if start is pivot:
                if (arr[start] > arr[(start + 1) % arr.length])
                    return start;
                start++;
                if (end - 1 >= 0 && arr[end] < arr[end - 1])
                    return end - 1;
                end--;
            }
            //left side is sorted so pivot in right side
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end])
                start = mid + 1;
            else
                end = mid - 1;

        }
        return -1;
    }
}
