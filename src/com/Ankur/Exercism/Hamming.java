package com.Ankur.Exercism;

public class Hamming {
    String left;
    String right;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.isBlank() && !rightStrand.isBlank())
            throw new IllegalArgumentException("left strand must not be empty.");
        if (rightStrand.isBlank() && !leftStrand.isBlank())
            throw new IllegalArgumentException("right strand must not be empty.");
        if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        left = leftStrand;
        right = rightStrand;
    }

    public int getHammingDistance() {
        int count = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Hamming h = new Hamming("", "");
        System.out.println(h.getHammingDistance());
    }
}
