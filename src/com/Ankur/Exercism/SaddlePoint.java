package com.Ankur.Exercism;

import java.util.*;

public class SaddlePoint {
    //It's called a "saddle point" because it is greater than or equal to every element in its row and less than or equal to every element in its column.
    //A matrix may have zero or more saddle points.
    List<List<Integer>> matrix;

    SaddlePoint(List<List<Integer>> values) {
        matrix = values;
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        Set<MatrixCoordinate> response = new java.util.HashSet<>(Collections.emptySet());
        if (matrix.isEmpty())
            return response;
        for (int i = 0; i < matrix.size(); i++) {
            List<Integer> list = matrix.get(i);
            int maxElement = list.stream().max(Comparator.naturalOrder()).get();
            for (int k = 0; k < list.size(); k++) {
                if (list.get(k) == maxElement) {
                    boolean saddle = true;
                    for (List<Integer> l : matrix) {
                        if (l.get(k) < maxElement) {
                            saddle = false;
                            break;
                        }
                    }
                    if (saddle) {
                        response.add(new MatrixCoordinate(i + 1, k + 1));
                    }
                }
            }
        }
        return response;
    }

    public static void main(String[] args) {
        SaddlePoint matrix = new SaddlePoint(Arrays.asList(
                Collections.singletonList(2),
                Collections.singletonList(1),
                Collections.singletonList(4),
                Collections.singletonList(1)
        ));
        System.out.println(matrix.getSaddlePoints());
    }
}

class MatrixCoordinate implements Comparable<MatrixCoordinate> {
    private final int row;
    private final int col;

    MatrixCoordinate(final int row, final int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "Row: " + row + ", Column: " + col;
    }

    // Generated equals and hashcode.

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final MatrixCoordinate that = (MatrixCoordinate) o;

        return row == that.row && col == that.col;
    }

    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + col;
        return result;
    }

    @Override
    public int compareTo(MatrixCoordinate o) {
        int rowComparison = Integer.compare(row, o.row);
        return (rowComparison == 0) ? Integer.compare(col, o.col) : rowComparison;
    }
}