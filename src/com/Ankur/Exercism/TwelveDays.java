package com.Ankur.Exercism;


public class TwelveDays {

    private static final String[] ORDINALS = {"", "first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    private static final String[] NUMBERS = {"", "a", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve"};
    private static final String[] PRESENTS = {"", "Partridge in a Pear Tree", "Turtle Doves", "French Hens",
            "Calling Birds", "Gold Rings", "Geese-a-Laying", "Swans-a-Swimming", "Maids-a-Milking", "Ladies Dancing",
            "Lords-a-Leaping", "Pipers Piping", "Drummers Drumming"};

    String verse(int verseNumber) {
        StringBuilder result = new StringBuilder();
        result.append(String.format("On the %s day of Christmas my true love gave to me: ", ORDINALS[verseNumber]));
        for (int i = verseNumber; i > 0; i--) {
            result.append(i == verseNumber ? "" : i == 1 ? ", and " : ", ");
            result.append(String.format("%s %s", NUMBERS[i], PRESENTS[i]));
        }
        return result.append(".\n").toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder result = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            result.append(String.format("%s%s", verse(i), i == endVerse ? "" : "\n"));
        }
        return result.toString();
    }

    String sing() {
        return verses(1, 12);
    }

    public static void main(String[] args) {

    }
}
