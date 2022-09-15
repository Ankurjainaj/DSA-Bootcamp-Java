package com.Ankur.Conditional_Loops.IntermediateProgram;

import java.util.Scanner;

public class BattingAverage {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Runs: ");
        int runs = in.nextInt();
        System.out.println("Enter number of matches");
        int matches = in.nextInt();
        System.out.println("Enter number of not-out matches");
        int notOut = in.nextInt();
        int outmatches = matches - notOut;
        double bAverage = (float) runs / outmatches;
        System.out.println("Batting Average= " + bAverage);
        in.close();
    }
}
