package com.Ankur.First_Java;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Largest of the two: " + Math.max(a, b));
    }
}
