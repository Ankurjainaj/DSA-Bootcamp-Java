package com.Ankur.Exercism;

import java.util.Random;

public class DndCharacters {
    int initialHp = 10;
    static int strength = 0;
    static int dexterity = 0;
    static int constitution = 0;
    static int intelligence = 0;
    static int charisma = 0;
    static int wisdom = 0;

    static int ability() {
        Random random = new Random();
        return random.ints(4, 1, 7).sorted().skip(1).sum();

//        List<Integer> arr = new ArrayList<>(4);
//
//        for (int i = 0; i < 4; i++)
//            arr.add(random.nextInt(5) + 1);
//        Collections.sort(arr);
//        return arr.subList(1, 4).stream().reduce(0, Integer::sum);
    }

    int modifier(int input) {
        input -= 10;
        return (int) Math.floor(input / 2.0);
    }

    int getStrength() {
        if (strength == 0)
            strength = ability();
        return strength;
    }

    int getDexterity() {
        if (dexterity == 0)
            dexterity = ability();
        return dexterity;
    }

    int getConstitution() {
        if (constitution == 0)
            constitution = ability();
        return constitution;
    }

    int getIntelligence() {
        if (intelligence == 0)
            intelligence = ability();
        return intelligence;
    }

    int getWisdom() {
        if (wisdom == 0)
            wisdom = ability();
        return wisdom;
    }

    int getCharisma() {
        if (charisma == 0)
            charisma = ability();
        return charisma;
    }

    int getHitpoints() {
        return initialHp + modifier(getConstitution());
    }
}
