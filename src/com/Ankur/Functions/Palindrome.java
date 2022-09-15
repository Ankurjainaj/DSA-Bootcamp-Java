package com.Ankur.Functions;

import java.util.Scanner;

public class Palindrome {

    // Write a function to find if a number if palindrome or not. Take number as parameter.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");
        in.close();
    }

    public static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        return num == rev;
    }
}
