package com.Ankur.Exercism;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flattener {

    Flattener() {
    }

    List<Object> flatten(List<Object> list) {
        return list.stream().filter(Objects::nonNull).flatMap(c -> {
            if (c instanceof Collection) {
                return flatten((List<Object>) c).stream();
            } else
                return Stream.of(c);
        }).collect(Collectors.toList());
    }
}
