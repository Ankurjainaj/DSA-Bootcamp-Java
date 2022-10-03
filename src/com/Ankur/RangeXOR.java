package com.Ankur;

import java.util.Scanner;

public class RangeXOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(findXOR(a, b));
    }

    static int findXOR(int a, int b) {
        return XOR(b) ^ XOR(a - 1);
    }

    static int XOR(int n) {
        if (n % 4 == 0)
            return n;
        if (n % 4 == 1)
            return 1;
        if (n % 4 == 2)
            return 3;
        return 0;
    }
}
