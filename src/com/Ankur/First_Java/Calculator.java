package com.Ankur.First_Java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        char operator = in.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Sum: " + (a + b));
                break;
            case '-':
                System.out.println("Difference: " + (a - b));
                break;
            case '/':
                System.out.println("Division: " + (a / b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;
            default:
                System.out.println("enter a valid operator");
        }
        in.close();
    }
}
