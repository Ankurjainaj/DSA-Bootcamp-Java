package com.Ankur.Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class SortColors {
    //https://leetcode.com/problems/sort-colors/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(sortColors(arr)));
    }

    static int[] sortColors(int[] arr) {
        int twoPointer = arr.length - 1;
        int zeroPointer = 0;
        for (int i = 0; i <= twoPointer; i++) {
            while (arr[i] == 2) {
                swap(arr, i, twoPointer);
                twoPointer--;
            }
            while (arr[i] == 0 && i > zeroPointer) {
                swap(arr, i, zeroPointer);
                zeroPointer++;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    void sortColors1(int A[], int n) {
        int num0 = 0, num1 = 0, num2 = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] == 0) ++num0;
            else if (A[i] == 1) ++num1;
            else if (A[i] == 2) ++num2;
        }

        for (int i = 0; i < num0; ++i) A[i] = 0;
        for (int i = 0; i < num1; ++i) A[num0 + i] = 1;
        for (int i = 0; i < num2; ++i) A[num0 + num1 + i] = 2;
    }

    // one pass in place solution
    void sortColors2(int A[], int n) {
        int n0 = -1, n1 = -1, n2 = -1;
        for (int i = 0; i < n; ++i) {
            if (A[i] == 0) {
                A[++n2] = 2;
                A[++n1] = 1;
                A[++n0] = 0;
            } else if (A[i] == 1) {
                A[++n2] = 2;
                A[++n1] = 1;
            } else if (A[i] == 2) {
                A[++n2] = 2;
            }
        }
    }

    // one pass in place solution
    void sortColors3(int A[], int n) {
        int j = 0, k = n - 1;
        for (int i = 0; i <= k; ++i) {
            if (A[i] == 0 && i != j)
                swap(A, i--, j++);
            else if (A[i] == 2 && i != k)
                swap(A, i--, k--);
        }
    }

    // one pass in place solution
    void sortColors4(int A[], int n) {
        int j = 0, k = n - 1;
        for (int i = 0; i <= k; i++) {
            if (A[i] == 0)
                swap(A, i, j++);
            else if (A[i] == 2)
                swap(A, i--, k--);
        }
    }
}
