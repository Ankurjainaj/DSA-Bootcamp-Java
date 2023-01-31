package com.Ankur.Exercism;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public class Allergies {

    int score;

    public Allergies(int score) {
        this.score = score;
    }

    public boolean isAllergicTo(Allergen allergen) {
        return (allergen.getScore() & score) == allergen.getScore();
    }

    public List<Allergen> getList() {
        return EnumSet.allOf(Allergen.class).stream().filter(this::isAllergicTo).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Allergies allergies = new Allergies(5);
        System.out.println(allergies.getList());
    }
}

enum Allergen {
    EGGS(1),
    PEANUTS(2),
    SHELLFISH(4),
    STRAWBERRIES(8),
    TOMATOES(16),
    CHOCOLATE(32),
    POLLEN(64),
    CATS(128);

    private final int score;

    Allergen(int score) {
        this.score = score;
    }

    int getScore() {
        return score;
    }
}
