package com.Ankur.Exercism;

import static java.util.Arrays.stream;
import static java.util.stream.IntStream.range;

class SumOfMultiples {
    int[] set;
    int number;

    SumOfMultiples(int number, int[] set) {
        this.set = set;
        this.number = number;
    }

    int getSum() {
//        Set<Integer> set1 = new HashSet<>();
//        int k = 1;
//        while (k < number) {
//            for (int i : set) {
//                if (i != 0 && k % i == 0)
//                    set1.add(k);
//            }
//            k++;
//        }
//        return set1.stream().reduce(0, Integer::sum);
        return range(0, number)
                .filter(n -> stream(set).anyMatch(factor -> factor > 0 && n % factor == 0))
                .sum();
    }

}
