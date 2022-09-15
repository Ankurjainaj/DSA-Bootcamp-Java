package com.Ankur.Functions;

import java.util.Scanner;

public class PythagoreanTriplets {
    // Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two number is equal to the square of the third number).
    // For example, (3, 4, 5) is a Pythagorean triplet.
    // Function should return true if the given triplet is a Pythagorean triplet else return false.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = in.nextInt();
        System.out.println("Enter the second number :");
        int b = in.nextInt();
        System.out.println("Enter the third number :");
        int c = in.nextInt();
        if (tripletOrNot(a, b, c))
            System.out.println("These numbers are pythagorean triplet!");
        else
            System.out.println("These numbers are not a pythagorean triplet!");
        in.close();
    }

    public static boolean tripletOrNot(int a, int b, int c) {
        if (a < b && b < c) {
            if (a * a + b * b == c * c)
                return true;
        }
        return false;
    }
}
