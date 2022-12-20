package com.Ankur.Exercism;

import java.util.ArrayList;
import java.util.List;

public class NaturalNumber {
    public NaturalNumber(long number) {
        if (number <= 0)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.number = number;
    }

    long number;

    enum Classification {

        DEFICIENT, PERFECT, ABUNDANT

    }

    public Classification getClassification() {
        if (number == 1)
            return Classification.DEFICIENT;
        List<Long> factors = getFactors(number);
        long reduce = factors.stream().reduce(0L, Long::sum);
        reduce++;
        if (reduce == number)
            return Classification.PERFECT;
        else if (reduce > number)
            return Classification.ABUNDANT;
        else
            return Classification.DEFICIENT;
    }

    List<Long> getFactors(long a) {
        List<Long> response = new ArrayList<>();
        for (long i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                response.add(i);
                response.add(a / i);
            }
        }
        return response;
    }

    public static void main(String[] args) {
        NaturalNumber n = new NaturalNumber(32);
        System.out.println(n.getClassification());
    }
}
