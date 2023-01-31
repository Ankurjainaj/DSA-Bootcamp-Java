package com.Ankur.Exercism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Sieve {
    //Sieve of Eratosthenes to find prime numbers
    int maxPrime;

    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
        List<Integer> response = new ArrayList<>();
        if (maxPrime == 1)
            return Collections.emptyList();
        boolean[] primeList = new boolean[maxPrime + 1];

        for (int i = 2; i * i <= maxPrime; i++) {
            if (!primeList[i]) {
                for (int j = i * 2; j <= maxPrime; j += i) {
                    primeList[j] = true;
                }
            }
        }
        for (int i = 2; i <= maxPrime; i++) {
            if (!primeList[i])
                response.add(i);
        }
        System.out.println(Arrays.toString(primeList));
        return response;
    }

    public static void main(String[] args) {
        Sieve s = new Sieve(10);
        System.out.println(s.getPrimes());
    }
}
