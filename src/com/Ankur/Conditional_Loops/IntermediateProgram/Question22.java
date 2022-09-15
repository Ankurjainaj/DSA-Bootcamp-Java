package com.Ankur.Conditional_Loops.IntermediateProgram;

import java.util.Scanner;

public class Question22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = in.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println("It is a Vowel.");
        else
            System.out.println("It is a Consonant.");
        in.close();
    }
}
