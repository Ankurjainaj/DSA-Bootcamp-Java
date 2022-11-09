package com.Ankur.Searching.Easy;

import java.util.Scanner;

public class ArrangingCoins {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n) {
        long i = 1;
        while ((i * i + i) <= 2L * n) {
            i++;
        }
        return (int)i-1;
    }
}
