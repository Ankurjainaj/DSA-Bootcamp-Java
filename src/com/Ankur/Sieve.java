package com.Ankur;

import java.util.Scanner;

public class Sieve {
    // Prime numbers from 2 till n
    // Sieve of Eratosthenes
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] primes = new boolean[n + 1];
        sieve(primes, n);
    }

    //False in array means that the number is prime
    //S(n) = O(n),   Space complexity
    //T(n) = O(n log(log n))
    static void sieve(boolean[] arr, int n) {
        for (int i = 2; i * i <= n; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!arr[i])
                System.out.print(i + " ");
        }
    }
}
