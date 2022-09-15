package com.Ankur.Conditional_Loops.IntermediateProgram;

import java.util.Scanner;

public class NCR_NPR {
    static int fact(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = in.nextInt();
        System.out.println("Enter value of r: ");
        int r = in.nextInt();
        if (n >= r) {
            System.out.println(n + "C" + r + ": " + fact(n) / (fact(n - r) * fact(r)));
            System.out.println(n + "P" + r + ": " + fact(n) / (fact(n - r)));
        }
        in.close();
    }
}
