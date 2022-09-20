package com.Ankur.Algorithms.Searching;

import java.util.Scanner;

public class BinarySearch {
    //Input string in ascending order
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(binarySearch(arr, target));
    }

    //return the index if found else return -1
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
//            int mid = (start + end) / 2; //might exceed the range of int in java
            //Better way to find int
            int mid = start + (end - start) / 2;

            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
