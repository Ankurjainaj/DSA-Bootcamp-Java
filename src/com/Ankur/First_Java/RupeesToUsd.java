package com.Ankur.First_Java;

import java.util.Scanner;

public class RupeesToUsd {
    public static void main(String[] args) {
        double rate = 0.013;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter currency in Rupees ");
        double rupees = in.nextDouble();
        System.out.println("Currency to USD: " + rupees * rate);
    }
}
