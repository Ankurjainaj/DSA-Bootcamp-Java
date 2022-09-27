package com.Ankur.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotationMatrixObtainable {
    //https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        int[][] target = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                target[i][j] = in.nextInt();
            }
        }
        System.out.println(rotationPossible(arr, target));
    }

    static boolean rotationPossible(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target))
                return true;
            rotate(mat);    //Will rotate the matrix by 90 degrees
        }
        return false;
    }

    static void rotate(int[][] arr) {
        //This will reverse the order of the rows in the matrix
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int[] tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        //Now transpose the matrix to make it rotate by 90 degrees
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }
    }
}
