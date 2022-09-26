package com.Ankur.Algorithms.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    //T(n) = O(n) in best case if the array is already sorted
    //T(n) = O(n^2) in worst case where the array is sorted in the opposite order
    static int[] bubbleSort(int[] arr) {
        //run steps for n-1 times
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            //for each step the max element will come at the last respective index of the array
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the prev. item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    c++;
                }
            }
            //To break the loop ahead of time if the array is sorted and there is no swap going on
            if (c == 0)
                break;
        }
        return arr;
    }
}
