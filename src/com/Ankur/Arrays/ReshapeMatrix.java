//package com.Ankur.Arrays;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ReshapeMatrix {
//
//    //https://leetcode.com/problems/reshape-the-matrix/
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int m = in.nextInt();
//        int n = in.nextInt();
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = in.nextInt();
//            }
//        }
//        int r = in.nextInt();
//        int c = in.nextInt();
//        System.out.println(Arrays.deepToString(matrixReshape(arr, r, c)));
//    }
//
//    public static int[][] matrixReshape(int[][] mat, int r, int c) {
//        int[][] response = new int[r][c];
//        int m = mat.length;
//        int n = mat[0].length;
//        int k = 0;
//        int[] arr = new int[m * n];
//
//        return response;
//    }
//}
