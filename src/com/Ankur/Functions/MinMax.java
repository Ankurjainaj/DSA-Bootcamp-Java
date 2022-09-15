package com.Ankur.Functions;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("The max of the three is: " + max(a, b, c));
        System.out.println("The min of the three is: " + min(a, b, c));
        in.close();
    }

    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
