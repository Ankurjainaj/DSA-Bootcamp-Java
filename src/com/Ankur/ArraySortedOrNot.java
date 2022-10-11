package com.Ankur;

public class ArraySortedOrNot {
    //Using Recursion
    public static void main(String[] args) {
        System.out.println(sortedArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 0));
    }

    static boolean sortedArray(int[] arr, int i) {
        if (i == arr.length - 1)
            return true;
        return arr[i] < arr[i + 1] && sortedArray(arr, i + 1);
    }
}
