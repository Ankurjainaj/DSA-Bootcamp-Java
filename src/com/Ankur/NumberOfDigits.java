package com.Ankur;

import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  //number
        int b = in.nextInt(); //base

        int count = (int) (Math.log(n) / Math.log(b)) + 1;

        System.out.println(count);
    }
}
