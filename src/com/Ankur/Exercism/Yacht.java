package com.Ankur.Exercism;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Yacht {

    int[] dice = new int[5];
    YachtCategory yachtCategory;

    enum YachtCategory {

        YACHT,
        ONES,
        TWOS,
        THREES,
        FOURS,
        FIVES,
        SIXES,
        FULL_HOUSE,
        FOUR_OF_A_KIND,
        LITTLE_STRAIGHT,
        BIG_STRAIGHT,
        CHOICE

    }

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice = dice;
        this.yachtCategory = yachtCategory;
    }

    int score() {
        List<Integer> list = Arrays.stream(dice).boxed().collect(Collectors.toList());
        switch (this.yachtCategory) {
            case YACHT:
                return list.stream().distinct().count() == 1 ? 50 : 0;
            case CHOICE:
                return list.stream().reduce(0, Integer::sum);
            case BIG_STRAIGHT:
                return list.stream().sorted().collect(Collectors.toList()).equals(List.of(2, 3, 4, 5, 6)) ? 30 : 0;
            case LITTLE_STRAIGHT:
                return list.stream().sorted().collect(Collectors.toList()).equals(List.of(1, 2, 3, 4, 5)) ? 30 : 0;
            case ONES:
                return (int) list.stream().filter(n -> n == 1).count();
            case TWOS:
                return (int) list.stream().filter(n -> n == 2).count() * 2;
            case THREES:
                return (int) list.stream().filter(n -> n == 3).count() * 3;
            case FOURS:
                return (int) list.stream().filter(n -> n == 4).count() * 4;
            case FIVES:
                return (int) list.stream().filter(n -> n == 5).count() * 5;
            case SIXES:
                return (int) list.stream().filter(n -> n == 6).count() * 6;
            case FOUR_OF_A_KIND:
                return list.stream().filter(n -> Collections.frequency(list, n) >= 4).limit(4).reduce(0, Integer::sum);
            case FULL_HOUSE:
                if (list.stream().distinct().count() == 2 && list.stream().distinct().allMatch(n -> Collections.frequency(list, n) >= 2))
                    return list.stream().reduce(0, Integer::sum);
                else
                    return 0;
            default:
                return 0;
        }
    }
}
