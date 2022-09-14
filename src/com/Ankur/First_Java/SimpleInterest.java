package com.Ankur.First_Java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double p, r, t, interest;
        System.out.print("Enter principal amount: ");
        p = in.nextDouble();
        System.out.print("Enter rate: ");
        r = in.nextDouble();
        System.out.print("Enter time in years: ");
        t = in.nextDouble();
        interest = p * r * t / 100;
        System.out.print("Simple interest: ");
        System.out.format("%.2f", interest);

    }
}
