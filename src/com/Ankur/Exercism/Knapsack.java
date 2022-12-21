package com.Ankur.Exercism;

import java.util.Arrays;
import java.util.List;

public class Knapsack {

    Integer maximumValue(int weight, List<Item> items) {
        int[] prevBestCostAtWeight = new int[weight + 1];
        for (Item item : items) {
            int[] bestCostAtWeight = new int[weight + 1];
            for (int i = 0; i < weight + 1; i++) {
                if (i < item.weight) bestCostAtWeight[i] = prevBestCostAtWeight[i];
                else
                    bestCostAtWeight[i] = Math.max(prevBestCostAtWeight[i], item.value + prevBestCostAtWeight[i - item.weight]);
            }
            prevBestCostAtWeight = bestCostAtWeight;
        }
        return prevBestCostAtWeight[weight];
    }

    public static void main(String[] args) {
        Knapsack ks = new Knapsack();
        System.out.println(ks.maximumValue(10, Arrays.asList(new Item(10, 1), new Item(1, 45))));
    }
}

class Item {
    int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}
