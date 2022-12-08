package com.Ankur.Exercism;

public class IsbnVerifier {
    static boolean isValid(String s) {
        int sum = 0;
        int k = 10;
        s = s.replace("-", "");
        if (s.length() != 10)
            return false;
        for (int i = 0; i < s.length(); i++) {
            int c = 0;
            if(Character.isLetter(s.charAt(i)) && s.charAt(i) != 'X')
                return false;
            if (s.charAt(i) == 'X')
                c = 10;
            else
                c = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += c * k;
            k--;
        }
        return sum % 11 == 0;
    }

    public static void main(String[] args) {
        String s = "3-598-2X507-9";
        System.out.println(isValid(s));
    }
}
