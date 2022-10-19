package com.Ankur.Algorithms.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(mergeSort(arr)));
        mergeInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
            return arr;
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] response = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                response[k] = left[i];
                i++;
            } else {
                response[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            response[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            response[k] = right[j];
            k++;
            j++;
        }
        return response;
    }

    static void mergeInPlace(int[] arr, int start, int end) {
        if (end - start == 1)
            return;
        int mid = (start + end) / 2;
        mergeInPlace(arr, start, mid);
        mergeInPlace(arr, mid, end);
        merge2(arr, start, mid, end);
    }

    private static void merge2(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, arr, start, mix.length);
    }
}
