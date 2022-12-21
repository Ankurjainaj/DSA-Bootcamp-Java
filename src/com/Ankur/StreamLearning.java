package com.Ankur;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLearning {

    public static void main(String[] args) {
        int a = 0;
//        Stream<Integer> str = Stream.generate(() -> a).limit(100);
//        System.out.println(str.collect(Collectors.toList()));

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 7, 6);
        integerList.sort(Comparator.naturalOrder());
        System.out.println(integerList);
        Spliterator<Integer> spliterator = integerList.spliterator();
        System.out.println(spliterator.characteristics());
        System.out.println(spliterator.estimateSize());
        System.out.println(spliterator.getExactSizeIfKnown());
//        System.out.println(spliterator.getComparator());
        System.out.println(spliterator.hasCharacteristics(Spliterator.ORDERED));
        System.out.println(spliterator.tryAdvance(System.out::println));
        spliterator.forEachRemaining(System.out::println);

        Stream<Integer> s = integerList.stream();
        spliterator = s.spliterator();
        Spliterator<Integer> spliterator1 = spliterator.trySplit();

        if (spliterator1 != null) {
            System.out.println("Output from spliterator1: ");
            spliterator1.forEachRemaining(System.out::println);
        }
        spliterator.forEachRemaining(System.out::println);

        IntStream intStream = IntStream.of(1234, 34, 23, 42, 34, 23, 423);
//        intStream.forEachOrdered(System.out::println);
        intStream.forEach(System.out::println);
        intStream = IntStream.iterate(0, i -> i + 1).limit(10);
        intStream.forEach(System.out::println);
        intStream = IntStream.generate(() -> (int) (Math.random() * 1000)).limit(10);
        intStream.forEach(System.out::println);
    }
}
