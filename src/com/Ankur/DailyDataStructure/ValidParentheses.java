package com.Ankur.DailyDataStructure;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    //https://leetcode.com/problems/valid-parentheses/?envType=study-plan&id=data-structure-i
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                counter++;
            } else {
                Character pop = null;
                if (counter > 0)
                    pop = stack.pop();
                if ((pop != null) && ((pop == '(' && s.charAt(i) == ')') || (pop == '{' && s.charAt(i) == '}') || (pop == '[' && s.charAt(i) == ']'))) {
                    counter--;
                    continue;
                } else
                    return false;
            }
        }
        return counter == 0;
    }
}
