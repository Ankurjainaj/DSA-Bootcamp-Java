package com.Ankur.Arrays.Easy;

import java.util.Scanner;

public class FlipAnImage {

    //https://leetcode.com/problems/flipping-an-image/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        flipAndInvertImage(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int k = 0;
            int[] a = new int[image[i].length];
            for (int j = image[i].length - 1; j >= 0; j--) {
                a[k] = image[i][j];
                k++;
            }
            image[i] = a;
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 1)
                    image[i][j] = 0;
                else
                    image[i][j] = 1;
            }
        }
        return image;
    }

    public static int[][] flipAndInvertImage1(int[][] image) {
        for (int[] a : image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                int tmp = a[i] ^ 1;
                a[i] = a[image[0].length - i - 1] ^ 1;
                a[image[0].length - i - 1] = tmp;
            }
        }
        return image;
    }

}
