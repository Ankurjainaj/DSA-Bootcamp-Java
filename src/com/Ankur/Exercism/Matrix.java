package com.Ankur.Exercism;

import java.util.Arrays;

public class Matrix {
    private final int[][] mat;

    Matrix(String matrixAsString) {
        int row = 0;
        int col = 0;
        String[] split = matrixAsString.split("\\n");
        row = split.length;
        col = split[0].split(" ").length;
        mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            String[] str = split[i].split(" ");
            for (int j = 0; j < col; j++) {
                mat[i][j] = Integer.parseInt(str[j]);
            }
        }
    }

    int[] getRow(int rowNumber) {
        return mat[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        int[] response = new int[mat.length];
        int k = 0;
        for (int[] ints : mat) {
            response[k] = ints[columnNumber - 1];
            k++;
        }
        return response;
    }

    public static void main(String[] args) {
        String matrixAsString = "1";
        Matrix matrix = new Matrix(matrixAsString);
        System.out.println(Arrays.deepToString(matrix.mat));
    }
}
