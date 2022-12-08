package com.Ankur.Exercism;

public class LargestSeriesProductCalculator {
    private String number;

    LargestSeriesProductCalculator(String s) {
        if (s == null) throw new IllegalArgumentException("String to search must be non-null.");
        if (s.matches(".*\\D+.*")) throw new IllegalArgumentException("String to search may only contains digits.");
        number = s;
    }

    long calculateLargestProductForSeriesLength(int nod) {
        if (nod < 0) throw new IllegalArgumentException("Series length must be non-negative.");
        if (nod > number.length()) throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        int max = 1;
        for (int i = 0; i < number.length() - nod + 1; i++) {
            int prod = 1;
            for (int j = i; j < i + nod; j++) {
                prod *= Character.getNumericValue(number.charAt(j));
            }
            max = Math.max(max, prod);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "1027839564";
        LargestSeriesProductCalculator l = new LargestSeriesProductCalculator(s);
        System.out.println(l.calculateLargestProductForSeriesLength(3));
    }
}