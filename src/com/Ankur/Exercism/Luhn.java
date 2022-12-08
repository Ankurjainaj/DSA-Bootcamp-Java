package com.Ankur.Exercism;

import java.util.regex.Pattern;

public class Luhn {

    public static void main(String[] args) {
        String s = "234 567 891 234";
        System.out.println(isValid(s));
    }

    static boolean isValid(String candidate) {
        if(candidate.replace(" ","").length()<2)
            return false;
        if(!Pattern.matches("^[0-9 ]+$", candidate))
            return false;
        char[] arr = new StringBuilder(candidate).reverse().toString().replace(" ", "").toCharArray();
        for (int i = 1; i < arr.length; i += 2) {
            int a = Integer.parseInt(String.valueOf(arr[i]));
            arr[i] = String.valueOf(a * 2 > 9 ? a * 2 - 9 : a * 2).toCharArray()[0];
        }
        int sum = 0;
        for (char c : arr) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum % 10 == 0;
    }
}
