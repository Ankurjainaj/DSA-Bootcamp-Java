package com.Ankur.Functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = in.nextInt();
        System.out.print("The given number is: ");
        evenOdd(n);
        in.close();
    }

    static void evenOdd(int a) {
        if (a % 2 == 0)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }
}
