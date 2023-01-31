package com.Ankur.Exercism;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class WordSearcher {
    Map<String, Optional<WordLocation>> search(final Set<String> words, final char[][] grid) {
        Map<String, Optional<WordLocation>> res = new HashMap<>();
        // generate possible directions
        Pair[] directions = new Pair[8];
        for (int i = 0; i < 9; i++)
            directions[i < 5 ? i : i - 1] = new Pair(i / 3 - 1, i % 3 - 1);

        for (String s : words) {
            res.put(s, Optional.empty());
            // find match for first character
            for (int x = 0; x < grid.length; x++)
                for (int y = 0; y < grid[0].length; y++)
                    if (s.charAt(0) == grid[x][y]) {
                        int len = s.length();
                        for (Pair pt : directions) {
                            int x1 = x;
                            int y1 = y;
                            StringBuilder stringBuilder = new StringBuilder(String.valueOf(grid[x1][y1]));
                            for (int i = 1; i < len; i++) {
                                x1 += pt.getX();
                                y1 += pt.getY();
                                if (x1 < 0 || y1 < 0 || x1 >= grid.length || y1 >= grid[x1].length || grid[x1][y1] != s.charAt(i))
                                    break;
                                stringBuilder.append(grid[x1][y1]);
                            }
                            if (stringBuilder.length() == len && s.equals(stringBuilder.toString()))
                                res.put(s, Optional.of(new WordLocation(new Pair(y + 1, x + 1), new Pair(y1 + 1, x1 + 1))));
                        }
                    }
        }
        return res;
    }

    public static void main(String[] args) {
        WordSearcher wordSearcher = new WordSearcher();
        Map<String, Optional<WordLocation>> expectedLocations = new HashMap<>();
        expectedLocations.put("clojure", Optional.of(new WordLocation(new Pair(1, 10), new Pair(7, 10))));
        expectedLocations.put("elixir", Optional.of(new WordLocation(new Pair(6, 5), new Pair(1, 5))));
        expectedLocations.put("ecmascript", Optional.of(new WordLocation(new Pair(10, 1), new Pair(10, 10))));
        expectedLocations.put("rust", Optional.of(new WordLocation(new Pair(9, 5), new Pair(9, 2))));
        expectedLocations.put("java", Optional.of(new WordLocation(new Pair(1, 1), new Pair(4, 4))));
        Set<String> searchWords = expectedLocations.keySet();
        Map<String, Optional<WordLocation>> actualLocations = wordSearcher.search(searchWords,
                new char[][]{
                        {'j', 'e', 'f', 'b', 'l', 'p', 'e', 'p', 'r', 'e'},
                        {'c', 'a', 'm', 'd', 'c', 'i', 'm', 'g', 't', 'c'},
                        {'o', 'i', 'v', 'o', 'k', 'p', 'r', 'j', 's', 'm'},
                        {'p', 'b', 'w', 'a', 's', 'q', 'r', 'o', 'u', 'a'},
                        {'r', 'i', 'x', 'i', 'l', 'e', 'l', 'h', 'r', 's'},
                        {'w', 'o', 'l', 'c', 'q', 'l', 'i', 'r', 'p', 'c'},
                        {'s', 'c', 'r', 'e', 'e', 'a', 'u', 'm', 'g', 'r'},
                        {'a', 'l', 'x', 'h', 'p', 'b', 'u', 'r', 'y', 'i'},
                        {'j', 'a', 'l', 'a', 'y', 'c', 'a', 'l', 'm', 'p'},
                        {'c', 'l', 'o', 'j', 'u', 'r', 'e', 'r', 'm', 't'}});
        System.out.println(actualLocations.values());

    }
}

class Pair {

    private final int x;

    private final int y;

    Pair(final int x, final int y) {
        this.y = y;
        this.x = x;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair pair = (Pair) o;
        return x == pair.x && y == pair.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

}

class WordLocation {

    private final Pair startCoord;

    private final Pair endCoord;

    WordLocation(final Pair startCoord, final Pair endCoord) {
        this.startCoord = startCoord;
        this.endCoord = endCoord;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WordLocation that = (WordLocation) o;
        return startCoord.equals(that.startCoord) && endCoord.equals(that.endCoord);
    }

    @Override
    public int hashCode() {
        int result = startCoord.hashCode();
        result = 31 * result + endCoord.hashCode();
        return result;
    }

}


