package com.Ankur.Algorithms.Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m]; //Taking pivot to be the middle element

        while (s <= e) {
            //Also a reason why if it is already sorted then it will not swap;
            while (arr[s] < pivot)
                s++;
            while (arr[e] > pivot)
                e--;
            if (s <= e) {
                int tmp = arr[s];
                arr[s] = arr[e];
                arr[e] = tmp;
                s++;
                e--;
            }
        }
        //Now pivot is at the correct index then sort the other two halves
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
