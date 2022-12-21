package com.Ankur.Exercism;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class House {

    static final String[] PARTS = {"the house that Jack built.", "the malt that lay in ", "the rat that ate ",
            "the cat that killed ", "the dog that worried ", "the cow with the crumpled horn that tossed ",
            "the maiden all forlorn that milked ", "the man all tattered and torn that kissed ",
            "the priest all shaven and shorn that married ", "the rooster that crowed in the morn that woke ",
            "the farmer sowing his corn that kept ", "the horse and the hound and the horn that belonged to "};


    String verse(int n) {
        StringBuilder str = new StringBuilder("This is ");
        for (int i = n - 1; i >= 0; i--) {
            str.append(PARTS[i]);
        }
        return str.toString();
    }

    String verse(int start, int end) {
        return IntStream.rangeClosed(start, end).mapToObj(this::verse).collect(Collectors.joining("/n"));
    }

    String sing() {
        return verse(1, 12);
    }
}
