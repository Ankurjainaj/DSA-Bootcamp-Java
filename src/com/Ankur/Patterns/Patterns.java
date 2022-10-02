package com.Ankur.Patterns;

public class Patterns {

    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern28(5);
//        pattern30(5);
//        pattern17(4);
        pattern31(4);
//        pattern36(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n + 1 - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            int noOfSpaces = n - c;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n - row;
            for (int i = 0; i < noOfSpaces; i++)
                System.out.print("  ");
            for (int col = row; col >= 1; col--)
                System.out.print(col + " ");
            for (int col = 2; col <= row; col++)
                System.out.print(col + " ");
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int i = 0; i < n - c; i++)
                System.out.print("  ");
            for (int col = c; col >= 1; col--)
                System.out.print(col + " ");
            for (int col = 2; col <= c; col++)
                System.out.print(col + " ");
            System.out.println();
        }
    }

    static void pattern36(int n) {
        //Considering the distances from the 4 sides the element present at the index will
        //be the min of the distance from all the walls
        //Distance from up = row;  left = col;  down = n- row; rignt = n-col;
        for (int row = 1; row <= 2 * n - 1; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                int atIndex = Math.min(Math.min(row, col), Math.min(2 * n - row, 2 * n - col));
                System.out.print(atIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {
        //Considering the distances from the 4 sides the element present at the index will
        // be the n- min of the distance from all the walls
        //Distance from up = row;  left = col;  down = n- row; rignt = n-col;
        for (int row = 1; row <= 2 * n - 1; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                int atIndex = Math.min(Math.min(row, col), Math.min(2 * n - row, 2 * n - col));
                System.out.print(Math.abs(n + 1 - atIndex) + " ");
            }
            System.out.println();
        }
    }
}
