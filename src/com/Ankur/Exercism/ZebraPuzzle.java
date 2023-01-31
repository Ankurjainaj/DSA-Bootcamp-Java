package com.Ankur.Exercism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZebraPuzzle {

    private enum Owner {NORWEGIAN, UKRAINIAN, SPANIARD, ENGLISHMAN, JAPANESE}

    private enum Color {BLUE, RED, YELLOW, GREEN, IVORY}

    private enum Beverage {COFFEE, TEA, ORANGE_JUICE, WATER, MILK}

    private enum Pet {DOG, SNAILS, HORSE, FOX, ZEBRA}

    private enum Cigarettes {KOOLS, LUCKY_STRIKE, CHESTERFIELD, PARLIAMENTS, OLD_GOLD}

    private static class Solution {
        List<Owner> owners;
        List<Color> colors;
        List<Beverage> beverages;
        List<Pet> pets;
        List<Cigarettes> cigarettes;
    }

    private final Solution solution;

    ZebraPuzzle() {
        this.solution = generateSolution();
    }

    private Solution generateSolution() {
        Solution houses = new Solution();
        outer:
        for (List<Owner> owners : getPermutations(Owner.values())) {
            if (owners.indexOf(Owner.NORWEGIAN) != 0) {
                continue;
            }
            for (List<Color> colors : getPermutations(Color.values())) {
                if ((colors.indexOf(Color.BLUE) != 1)
                        || (colors.indexOf(Color.RED) != owners.indexOf(Owner.ENGLISHMAN))
                        || (!isJustAfter(colors, Color.GREEN, colors, Color.IVORY))) {
                    continue;
                }
                for (List<Beverage> beverages : getPermutations(Beverage.values())) {
                    if ((beverages.indexOf(Beverage.TEA) != owners.indexOf(Owner.UKRAINIAN))
                            || (beverages.indexOf(Beverage.MILK) != 2)
                            || (beverages.indexOf(Beverage.COFFEE) != colors.indexOf(Color.GREEN))) {
                        continue;
                    }
                    for (List<Pet> pets : getPermutations(Pet.values())) {
                        if (pets.indexOf(Pet.DOG) != owners.indexOf(Owner.SPANIARD)) {
                            continue;
                        }
                        for (List<Cigarettes> cigarettes : getPermutations(Cigarettes.values())) {
                            if ((cigarettes.indexOf(Cigarettes.OLD_GOLD) != pets.indexOf(Pet.SNAILS))
                                    || (cigarettes.indexOf(Cigarettes.KOOLS) != colors.indexOf(Color.YELLOW))
                                    || (cigarettes.indexOf(Cigarettes.PARLIAMENTS) != owners.indexOf(Owner.JAPANESE))
                                    || (!isNext(cigarettes, Cigarettes.CHESTERFIELD, pets, Pet.FOX))
                                    || (!isNext(cigarettes, Cigarettes.KOOLS, pets, Pet.HORSE))
                                    || (cigarettes.indexOf(Cigarettes.LUCKY_STRIKE)
                                    != beverages.indexOf(Beverage.ORANGE_JUICE))) {
                                continue;
                            }
                            houses.owners = owners;
                            houses.colors = colors;
                            houses.beverages = beverages;
                            houses.pets = pets;
                            houses.cigarettes = cigarettes;
                            break outer;
                        }
                    }
                }
            }
        }
        return houses;
    }

    private static <T> List<List<T>> getPermutations(T[] array) {
        List<List<T>> permutations = new ArrayList<>();
        permute(permutations, array, 0);
        return permutations;
    }

    private static <T> void permute(List<List<T>> permutations, T[] array, int startIndex) {
        if (startIndex == (array.length - 1)) {
            permutations.add(new ArrayList<>(Arrays.asList(array)));
        }
        for (int i = startIndex; i < array.length; i++) {
            swap(array, startIndex, i);
            permute(permutations, array, startIndex + 1);
            swap(array, startIndex, i);
        }
    }

    private static <T> void swap(T[] array, int index1, int index2) {
        T aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

    private static <T, U> boolean isNext(List<T> list1, T element1, List<U> list2, U element2) {
        return isJustBefore(list1, element1, list2, element2)
                || isJustAfter(list1, element1, list2, element2);
    }

    private static <T, U> boolean isJustBefore(List<T> list1, T element1, List<U> list2, U element2) {
        return (list1.indexOf(element1) < (list1.size() - 1))
                && (list2.get(list1.indexOf(element1) + 1) == element2);
    }

    private static <T, U> boolean isJustAfter(List<T> list1, T element1, List<U> list2, U element2) {
        return (list1.indexOf(element1) > 0)
                && (list2.get(list1.indexOf(element1) - 1) == element2);
    }

    private static <T, U> T get(List<T> searchList, List<U> filterList, U element) {
        return searchList.get(filterList.indexOf(element));
    }

    public String getWaterDrinker() {
        return capitalizeFirst(get(this.solution.owners, this.solution.beverages, Beverage.WATER).name());
    }

    public String getZebraOwner() {
        return capitalizeFirst(get(this.solution.owners, this.solution.pets, Pet.ZEBRA).name());
    }

    private static String capitalizeFirst(String value) {
        return value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase();
    }
}
