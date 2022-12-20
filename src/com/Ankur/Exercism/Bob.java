package com.Ankur.Exercism;

import java.util.regex.Pattern;

public class Bob {

    String hey(String s) {
        s = s.trim();
        if (s.length() == 0)
            return "Fine. Be that way!";
        else if (s.chars().anyMatch(Character::isAlphabetic) && s.chars().filter(Character::isAlphabetic).allMatch(Character::isUpperCase) && Pattern.matches("^.+\\?$", s))
            return "Calm down, I know what I'm doing!";
        else if (Pattern.matches("^.+\\?$", s))
            return "Sure.";
        else if (s.chars().anyMatch(Character::isAlphabetic) && s.chars().filter(Character::isAlphabetic).allMatch(Character::isUpperCase))
            return "Whoa, chill out!";
        else
            return "Whatever.";
    }

    public static void main(String[] args) {
        Bob b = new Bob();
        System.out.println(b.hey("\t\t\t\t\t\t"));
    }
}
