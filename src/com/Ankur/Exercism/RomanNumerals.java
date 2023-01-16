package com.Ankur.Exercism;

public class RomanNumerals {

    int number;
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    RomanNumerals(int n) {
        number = n; 
    }

    String getRomanNumeral() {
        int n = number;
        StringBuilder response = new StringBuilder();
        int i = -1;
        while (++i < values.length && n >= 0) {
            int num = n / values[i];
            response.append(numerals[i].repeat(num));
            n = n % values[i];
        }
        return response.toString();
    }

    public static void main(String[] args) {
        RomanNumerals r = new RomanNumerals(984);
        System.out.println(r.getRomanNumeral());
    }
}
