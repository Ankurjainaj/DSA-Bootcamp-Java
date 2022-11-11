package com.Ankur.Searching.Easy;

import java.util.HashSet;
import java.util.Scanner;

public class NAndDoubleExist {
    //https://leetcode.com/problems/check-if-n-and-its-double-exist/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            int search = search(arr, arr[i]);
//            if (search != -1 && search != i)
//                return true;
//        }
//        return false;
        HashSet<Integer> s = new HashSet<>();
        for (int i : arr) {
            if (s.contains(i * 2) || (i % 2 == 0 && s.contains(i / 2)))
                return true;
            s.add(i);
        }
        return false;
    }

    public static int search(int[] arr, int a) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == a * 2)
                return mid;
            if (arr[mid] > a * 2)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
