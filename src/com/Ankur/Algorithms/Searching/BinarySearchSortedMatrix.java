package com.Ankur.Algorithms.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchSortedMatrix {

    //If the matrix is in sorted format from first element being the smallest and the largest being the last element of the matrix
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int target = in.nextInt();
        System.out.println(Arrays.toString(search(arr, target)));
    }

    //Search in the row provided between the columns provided
    static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (arr[row][mid] == target)
                return new int[]{row, mid};
            if (arr[row][mid] < target)
                cStart = mid + 1;
            else
                cEnd = mid - 1;
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;  //check for the matrix may be empty
        if (col == 0)
            return new int[]{-1, -1};
        if (row == 1) {
            return binarySearch(arr, 0, 0, col - 1, target);
        }
        int rowStart = 0;
        int rowEnd = row - 1;
        int midCol = col / 2;
        //Run the loop till only 2 rows are remaining
        while (rowStart < rowEnd - 1) {
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (arr[mid][midCol] == target)
                return new int[]{mid, midCol};
            if (arr[mid][midCol] < target) {
                //Ignore the above rows and will consider only the lower rows
                rowStart = mid;
            } else
                rowEnd = mid;
        }

        //Now we have two rows
        //Check whether the target is in the column of the two rows
        if (arr[rowStart][midCol] == target)
            return new int[]{rowStart, midCol};
        if (arr[rowStart + 1][midCol] == target)
            return new int[]{rowStart + 1, midCol};

        //Search in the 1st half
        if (arr[rowStart][midCol - 1] >= target)
            return binarySearch(arr, rowStart, 0, midCol - 1, target);
        //Search in the 2nd half
        if (arr[rowStart][midCol + 1] <= target && arr[rowStart][col - 1] >= target)
            return binarySearch(arr, rowStart, midCol + 1, col - 1, target);
        //Search in the 3rd half
        if (arr[rowStart + 1][midCol - 1] >= target)
            return binarySearch(arr, rowStart + 1, 0, midCol - 1, target);
            //Search in the 4th half
        else
            return binarySearch(arr, rowStart + 1, midCol + 1, col - 1, target);

    }
}
