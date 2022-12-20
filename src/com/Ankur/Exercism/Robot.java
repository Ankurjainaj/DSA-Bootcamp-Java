package com.Ankur.Exercism;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Robot {
    private static final Set<String> registeredNames = new HashSet<>();
    private static Random random = new Random();
    private String name;

    public Robot() {
        reset();
    }

    public String getName() {
        return name;
    }

    public void reset() {
        registeredNames.remove(this.name);
        String name;
        while (registeredNames.contains(name = generateName())) {
            continue;
        }
        registeredNames.add(name);
        this.name = name;
    }

    private String generateName() {
        return randomString('A', 'Z', 2) + randomString('0', '9', 3);
    }

    private String randomString(char a, char b, int len) {
        return random.ints(a, b + 1).limit(len)
                .mapToObj(c -> Character.toString((char) c)).collect(Collectors.joining());
    }
}
