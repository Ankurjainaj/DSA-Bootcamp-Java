package com.Ankur;

//import java.util.Scanner;
//
//public class FindInMountainArray {
//
//    // https://leetcode.com/problems/find-in-mountain-array/
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = in.nextInt();
//        }
//        int target = in.nextInt();
//        System.out.println(mountainArraySearch(arr, target));
//    }
//
//    public static int mountainArraySearch(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//    }
//
//    public static int mountainArray(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//
//            if (arr[mid] > arr[mid + 1]) //In decreasing part of array so it may be the ans but look before it also
//                end = mid;
//            else //In increasing part of array so look after this
//                start = mid + 1;
//        }
//        //In the end start==end and will be pointing to the largest element as they are finding the largest element in the array.
//        return start;
//    }
//
//    static int binarySearch(int[] arr, int target, int start, int end) {
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid])
//                end = mid - 1;
//            else if (target > arr[mid])
//                start = mid + 1;
//            else
//                return mid;
//        }
//        return start;
//
//    }
//
//}
