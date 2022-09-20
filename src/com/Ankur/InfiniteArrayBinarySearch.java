package com.Ankur;

public class InfiniteArrayBinarySearch {
    //GFG question Amazon interview
    //Consider we can't use length to consider array to be infinite

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 12, 25, 34, 56, 78, 89, 100, 120};
        int target = 89;
        System.out.println(findRange(arr, target));
    }

    static int findRange(int[] arr, int target) {
        int start = 0;
        int end = 1;//box of size 2
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;//new end is double the previous size of the block
            start = newStart;
        }
        return infArray(arr, target, start, end);
    }

    static int infArray(int[] arr, int target, int start, int end) {

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
