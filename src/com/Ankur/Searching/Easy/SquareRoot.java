package com.Ankur.Searching.Easy;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(squareRoot(n));
    }

    public static int squareRoot(int x) {
        boolean found = false;
        double sqrt = 0;
        double i = 1;
        while (!found) {
            if (i * i == x)
                return (int) i;
            if (i * i > x) {
                sqrt = search(x, i - 1, i);
                found = true;
            }
            i++;
        }
        return (int) sqrt;
    }

    private static double search(int x, double i, double j) {
        double mid = i + (j - i) / 2;
        if (mid * mid == x || (Math.abs(mid * mid - x) < 0.00001))
            return mid;
        if (mid * mid > x) {
            return search(x, i, mid);
        } else {
            return search(x, mid, j);
        }
    }

}
