package com.Ankur.Functions;

import java.util.Scanner;

public class DecimalToAnyBase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = in.nextInt();
        int res = getValueInBase(n, b);
        System.out.println(res);
        in.close();
    }

    public static int getValueInBase(int n, int b) {
        int rv = 0; // return value
        int p = 1; // 10^0 = 1
        while (n > 0) {
            int dig = n % b; // get the last digit on dividing by base
            n = n / b; // remove the last digit
            rv += dig * p; // digit times power and add to return value
            p *= 10; // increase power of 10 by 1
        }
        return rv;
    }
}
