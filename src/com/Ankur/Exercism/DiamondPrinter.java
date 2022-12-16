package com.Ankur.Exercism;

import java.util.Arrays;
import java.util.List;

public class DiamondPrinter {

    List<String> printToList(char a) {
        int number = a - 'A' + 1;
        int size = 2 * (number - 1) + 1;
        String[] lines = new String[size];
        for (int i = 0; i < size / 2 + 1; i++) {
            char c = (char) ('A' + i);
            int leftPosition = size / 2 + i;
            int rightPosition = size - leftPosition - 1;
            char[] buffer = new char[size];
            Arrays.fill(buffer, ' ');
            buffer[leftPosition] = c;
            buffer[rightPosition] = c;
            String line = new String(buffer);

            lines[i] = line;
            lines[size - 1 - i] = line;
        }
        return Arrays.asList(lines);
    }

    public static void main(String[] args) {
        DiamondPrinter d = new DiamondPrinter();
        System.out.println(d.printToList('Z'));
    }
}
