package com.Ankur.Conditional_Loops.IntermediateProgram;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This program checks whether the entered number is armstrong or not.");
        int num;
        do {
            System.out.print("Enter a positive integer (0 to exit) : ");
            num = in.nextInt();
            if (armstrong_check(num))
                System.out.println("Yes, It is a armstrong number.");
            else
                System.out.println("No, It is not a armstrong number.");

        } while (num != 0);
    }

    static boolean armstrong_check(int n) {
        int cube = 0;
        int a = n;
        while (n > 0) {
            int r = n % 10;
            cube += r * r * r;
            n /= 10;
        }
        return cube == a;
    }
}
