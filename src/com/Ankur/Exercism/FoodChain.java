package com.Ankur.Exercism;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FoodChain {

    private static final String[][] STRINGS = new String[][]{
            {"fly", "", ""},
            {"spider", "It wriggled and jiggled and tickled inside her.\n",
                    " that wriggled and jiggled and tickled inside her"},
            {"bird", "How absurd to swallow a bird!\n", ""},
            {"cat", "Imagine that, to swallow a cat!\n", ""},
            {"dog", "What a hog, to swallow a dog!\n", ""},
            {"goat", "Just opened her throat and swallowed a goat!\n", ""},
            {"cow", "I don't know how she swallowed a cow!\n", ""}
    };

    String verse(int n) {
        StringBuilder sb = new StringBuilder("I know an old lady who swallowed a ");
        if (n == 8) {
            sb.append("horse.\nShe's dead, of course!");
            return sb.toString();
        }
        for (int i = n - 1; i > 0; i--) {
            sb.append(String.format("%1$s%3$s.%n%2$sShe swallowed the %1$s to catch the ", STRINGS[i][0]
                    , n - 1 == i ? STRINGS[i][1] : ""
                    , i != n - 1 ? STRINGS[i][2] : ""));
        }
        sb.append(String.format("%1s.%nI don't know why she swallowed the %1$s. Perhaps she'll die.", STRINGS[0][0]));
        return sb.toString();
    }

    String verses(int start, int end) {
        return IntStream.rangeClosed(start, end).mapToObj(this::verse).collect(Collectors.joining("\n\n"));
    }
}
