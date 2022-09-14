package com.Ankur.First_Java;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }
}
