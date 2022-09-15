package com.Ankur.Functions;

import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = in.nextInt();
        vote(age);
        in.close();
    }

    static void vote(int age) {
        if (age >= 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote");
    }
}
