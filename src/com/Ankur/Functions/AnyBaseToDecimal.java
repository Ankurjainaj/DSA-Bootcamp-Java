package com.Ankur.Functions;

import java.util.Scanner;

public class AnyBaseToDecimal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = in.nextInt();
        int d = getValueInDecimal(n, b);
        System.out.println(d);
        in.close();
    }

    public static int getValueInDecimal(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % 10; // get the last digit
            n /= 10; // remove the last digit
            rv += dig * p; // add the value of the digit to the return value
            p *= b; // increase the power of the base
        }
        return rv;
    }
}
