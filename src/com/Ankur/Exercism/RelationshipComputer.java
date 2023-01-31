package com.Ankur.Exercism;

import java.util.List;

import static java.util.Arrays.asList;

public class RelationshipComputer<T> {

    Relationship computeRelationship(List<T> firstList, List<T> secondList) {
        //Can Also use:
        //Collections.indexOfSubList(firstList,secondList);
        if (firstList.equals(secondList))
            return Relationship.EQUAL;
        else if (secondList.isEmpty() || (firstList.size() > secondList.size() && isSubset(firstList, secondList)))
            return Relationship.SUPERLIST;
        else if (firstList.isEmpty() || (firstList.size() < secondList.size() && isSubset(secondList, firstList)))
            return Relationship.SUBLIST;
        else
            return Relationship.UNEQUAL;
    }

    //First list is the bigger list here
    boolean isSubset(List<T> firstList, List<T> secondList) {
        for (int i = 0; i < firstList.size() - secondList.size() + 1; i++) {
            if (firstList.subList(i, i + secondList.size()).equals(secondList))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Relationship relationship = new RelationshipComputer<>().computeRelationship(
                asList(1, 2, 2, 3, 4),
                asList(2, 3, 4));
        System.out.println(relationship);
    }

}

enum Relationship {

    EQUAL, SUBLIST, SUPERLIST, UNEQUAL

}
