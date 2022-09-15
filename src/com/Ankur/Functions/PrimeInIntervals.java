package com.Ankur.Functions;

import java.util.Scanner;

public class PrimeInIntervals {
    // Write a function that returns all prime numbers between two given numbers.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = in.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = in.nextInt();
        int[] primeNumbers = getPrimeNumbers(firstNumber, secondNumber);
        for (int i = 0; i < primeNumbers.length; i++) {
            if (primeNumbers[i] != 0) {
                System.out.print(primeNumbers[i] + " ");
            }
        }
        in.close();
    }

    public static int[] getPrimeNumbers(int firstNumber, int secondNumber) {
        int[] primeNumbers = new int[secondNumber - firstNumber + 1];
        int number = firstNumber;
        int index = 0;
        while (number <= secondNumber) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers[index] = number;
                index++;
            }
            number++;
        }
        return primeNumbers;
    }
}
