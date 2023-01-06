package com.Ankur.Exercism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinesweeperBoard {

    List<String> inputBoard;
    List<List<String>> newBoard;

    MinesweeperBoard(List<String> board) {
        this.inputBoard = board;
        newBoard = new ArrayList<>();
        for (String s : inputBoard) {
            List<String> c = s.chars().mapToObj(cs -> Character.toString((char) cs)).collect(Collectors.toList());
            newBoard.add(c);
        }
    }

    public List<String> withNumbers() {
        if (inputBoard.isEmpty())
            return Collections.emptyList();
        List<String> response = new ArrayList<>();
        for (int i = 0; i < newBoard.size(); i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < newBoard.get(i).size(); j++) {
                int count = 0;
                if (newBoard.get(i).get(j).equals("*"))
                    str.append("*");
                else {
                    if (j + 1 < newBoard.get(i).size() && newBoard.get(i).get(j + 1).equals("*"))
                        count++;
                    if (j - 1 >= 0 && newBoard.get(i).get(j - 1).equals("*"))
                        count++;
                    if (i - 1 >= 0 && j + 1 < newBoard.get(i - 1).size() && newBoard.get(i - 1).get(j + 1).equals("*"))
                        count++;
                    if (i - 1 >= 0 && j - 1 >= 0 && newBoard.get(i - 1).get(j - 1).equals("*"))
                        count++;
                    if (i - 1 >= 0 && j < newBoard.get(i - 1).size() && newBoard.get(i - 1).get(j).equals("*"))
                        count++;
                    if (i + 1 < newBoard.size() && j + 1 < newBoard.get(i + 1).size() && newBoard.get(i + 1).get(j + 1).equals("*"))
                        count++;
                    if (i + 1 < newBoard.size() && j - 1 >= 0 && newBoard.get(i + 1).get(j - 1).equals("*"))
                        count++;
                    if (i + 1 < newBoard.size() && j < newBoard.get(i + 1).size() && newBoard.get(i + 1).get(j).equals("*"))
                        count++;
                    str.append(count == 0 ? " " : count);
                }
            }
            response.add(str.toString());
        }
        return response;
    }

    List<String> withNumbers2() {
        int height = inputBoard.size();
        int width = height == 0 ? 0 : inputBoard.get(0).length();

        int[][] field = new int[height][width];
        //fill in field, mines are -1
        for (int i = 0; i < height; i++)
            for (int j = 0; j < width; j++)
                if (inputBoard.get(i).charAt(j) == '*') {
                    field[i][j] = -1;
                    for (int y = Math.max(0, i - 1); y < Math.min(height, i + 2); y++)
                        for (int x = Math.max(0, j - 1); x < Math.min(width, j + 2); x++)
                            if (field[y][x] >= 0)
                                field[y][x]++;
                }

        //field to new board
        return Arrays.stream(field).map(row ->
                Arrays.stream(row).mapToObj(tile ->
                        tile == -1 ? "*" : tile == 0 ? " " : Integer.toString(tile)
                ).collect(Collectors.joining())
        ).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> inputBoard = Arrays.asList(
                "");
        List<String> actualNumberedBoard = new MinesweeperBoard(inputBoard).withNumbers();
        System.out.println(actualNumberedBoard);
    }
}
