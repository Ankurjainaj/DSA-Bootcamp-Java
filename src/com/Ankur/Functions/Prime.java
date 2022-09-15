package com.Ankur.Functions;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print("The number is: ");
        isPrime(num);
        in.close();
    }

    static void isPrime(int n) {
        int count = 0;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                System.out.println("Not Prime");
                break;
            }
        }
        if (count == 0)
            System.out.println("Prime");
    }
}
