package com.Ankur.Conditional_Loops.IntermediateProgram;

import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        double p = in.nextDouble();
        System.out.println("Enter Rate of interest");
        double rate = in.nextDouble();
        System.out.println("Enter time");
        double time = in.nextDouble();
        System.out.println(compoundInterest(p, rate, time));
        in.close();
    }

    static double compoundInterest(double p, double rate, double time) {
        return p * Math.pow((1 + rate / 100), time) - p;
    }
}
