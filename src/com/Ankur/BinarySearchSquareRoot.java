package com.Ankur;

public class BinarySearchSquareRoot {
    public static void main(String[] args) {
        int n = 4;
        int precision = 3;
        System.out.println(sqrt(n, precision));
    }

    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;
        double root = 0.0;
        while (e >= s) {
            int m = s + (e - s) / 2;
            if (m * m == n)
                return m;   //Case of perfect root
            if (m * m > n)
                e = m - 1;
            else
                s = m + 1;
        }
        root = e;
        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }

        return root;
    }
}
