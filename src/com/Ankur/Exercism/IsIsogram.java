package com.Ankur.Exercism;

public class IsIsogram {

    static boolean isIsogram(String phrase) {
        return phrase.toLowerCase().chars()
                .filter(Character::isLetter)
                .distinct().count() ==
                phrase.chars()
                        .filter(Character::isLetter)
                        .count();
    }

    public static void main(String[] args) {
        String s = "thumbscrew-jappingly";
        System.out.println(isIsogram(s));
    }
}
