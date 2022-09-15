package com.Ankur.Conditional_Loops.IntermediateProgram;

import java.util.Scanner;

public class CGPA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of subjects: ");
        n = in.nextInt();
        double[] mark = new double[n];
        double[] g = new double[n];
        double cgpa, sum = 0;
        System.out.println("Enter number of 1 subject: ");
        mark[0] = in.nextDouble();
        System.out.println("Enter number of 2 subject: ");
        mark[1] = in.nextDouble();
        System.out.println("Enter number of 3 subject: ");
        mark[2] = in.nextDouble();
        System.out.println("Enter number of 4 subject: ");
        mark[3] = in.nextDouble();
        System.out.println("Enter number of 5 subject: ");
        mark[4] = in.nextDouble();
        for (int i = 0; i < n; i++) {
            g[i] = (mark[i] / 10);
        }
        for (int i = 0; i < n; i++) {
            sum += g[i];
        }
        cgpa = sum / n;

        System.out.println("cgpa= " + cgpa);
        System.out.println("Percentage from cgpa= " + cgpa * 9.5);

    }
}
