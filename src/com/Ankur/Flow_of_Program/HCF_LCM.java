package com.Ankur.Flow_of_Program;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
        System.out.println("HCF of " + a + " and " + b + " is " + hcf(a, b));
    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    static int hcf(int a, int b) {
        if (a == 0)
            return b;
        else if (b == 0)
            return a;
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
}
