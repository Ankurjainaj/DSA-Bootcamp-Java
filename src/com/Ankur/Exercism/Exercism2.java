package com.Ankur.Exercism;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Exercism2 {
    static Map<Integer, Integer> m = new HashMap<>('Z' - 'A');

    static {
        mapToScore("AEIOULNRST", 1);
        mapToScore("DG", 2);
        mapToScore("BCMP", 3);
        mapToScore("FHVWY", 4);
        mapToScore("K", 5);
        mapToScore("JX", 8);
        mapToScore("QZ", 10);
    }

    static void mapToScore(String l, Integer i) {
        l.chars().forEach(letter -> m.put(letter, i));
    }

    int getScore(String word) {
        if (word == null) return 0;
        return word.toUpperCase().chars().map(c -> m.getOrDefault(c, 0)).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

    }

    BigInteger grainsOnSquare(final int square) {
        BigInteger a = BigInteger.valueOf(0);
        for (int i = 0; i < square; i++) {
            a = a.add(BigInteger.valueOf((long) Math.pow(2, i)));
        }
        return a;
    }

    BigInteger grainsOnBoard() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
