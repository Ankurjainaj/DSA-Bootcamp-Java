package com.Ankur;

import java.util.Scanner;

public class NThMagicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(magicNo(n));
    }

    static int magicNo(int n) {
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            ans += last * base;
            n = n >> 1;
            base = base * 5;
        }
        return ans;
    }
}
