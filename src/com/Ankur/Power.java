package com.Ankur;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pow = in.nextInt();
        System.out.println(power(n, pow));
    }

    static int power(int n, int pow) {
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1) == 1)
                ans = ans * n;
            n = n * n;
            pow = pow >> 1;
        }
        return ans;
    }
}
