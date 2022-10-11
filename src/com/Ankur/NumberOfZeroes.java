package com.Ankur;

public class NumberOfZeroes {

    public static void main(String[] args) {
        System.out.println(count(230000402030L));
    }

    static int count(Long n) {
        return helper(n, 0);
    }

    private static int helper(Long n, int i) {
        if (n == 0)
            return i;
        long rem = n % 10;
        if (rem == 0)
            return helper(n / 10, i + 1);
        return helper(n / 10, i);
    }
}
