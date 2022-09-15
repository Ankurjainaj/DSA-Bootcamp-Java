package com.Ankur.First_Java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder b = new StringBuilder(s);
        StringBuilder reverse = b.reverse();
        String r = reverse.toString();
        if (r.equals(s))
            System.out.println("The given string is Palindrome");
        else
            System.out.println("The given string is not Palindrome");
        in.close();
    }
}
