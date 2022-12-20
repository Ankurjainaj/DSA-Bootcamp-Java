package com.Ankur.Exercism;

public class BeerSong {

    private String beer = "%s of beer on the wall, %s of beer.\n" +
            "%s, %s of beer on the wall.\n\n";

    String sing(int a, int b) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < b; i++) {
            if (a == 0) {
                s.append(String.format(beer, "No more bottles", "no more bottles", "Go to the store and buy some more", "99 bottles"));
            } else if (a == 1) {
                s.append(String.format(beer, "1 bottle", "1 bottle", "Take it down and pass it around", "no more bottles"));
            } else if (a == 2) {
                s.append(String.format(beer, "2 bottles", "2 bottles", "Take one down and pass it around", "1 bottle"));
            } else
                s.append(String.format(beer, a + " bottles", a + " bottles", "Take one down and pass it around", (a - 1) + " bottles"));
            a--;
        }
        return s.toString();
    }

    String singSong() {
        return sing(99, 100);
    }

    public static void main(String[] args) {
        BeerSong b = new BeerSong();
        System.out.println(b.sing(2, 3));
    }
}
