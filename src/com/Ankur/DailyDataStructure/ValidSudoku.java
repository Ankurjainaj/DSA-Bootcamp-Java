package com.Ankur.DailyDataStructure;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    //https://leetcode.com/problems/valid-sudoku/?envType=study-plan&id=data-structure-i
    //Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
    //
    //Each row must contain the digits 1-9 without repetition.
    //Each column must contain the digits 1-9 without repetition.
    //Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
    //Note:
    //
    //A Sudoku board (partially filled) could be valid but is not necessarily solvable.
    //Only the filled cells need to be validated according to the mentioned rules.
    //Input =
    //[["8","3",".",".","7",".",".",".","."]
    //,["6",".",".","1","9","5",".",".","."]
    //,[".","9","8",".",".",".",".","6","."]
    //,["8",".",".",".","6",".",".",".","3"]
    //,["4",".",".","8",".","3",".",".","1"]
    //,["7",".",".",".","2",".",".",".","6"]
    //,[".","6",".",".",".",".","2","8","."]
    //,[".",".",".","4","1","9",".",".","5"]
    //,[".",".",".",".","8",".",".","7","9"]]

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        char[][] request = new char[9][9];
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                request[i][j] = in.next();
//            }
//        }

    }

    public static boolean isValidSudoku(char[][] board) {
        Set<String> s = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char n = board[i][j];
                if (n != '.') {
                    if (!s.add(n + "in row" + i) ||
                            !s.add(n + "in column" + j) ||
                            !s.add(n + "in block" + i / 3 + "-" + j / 3))
                        return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidSudoku1(char[][] board) {
        for (int i = 0; i < 9; i++) {
            int[] row = new int[9];
            int[] col = new int[9];
            int[] box = new int[9];

            for (int j = 0; j < 9; j++) {
                char rowVal = board[i][j];
                if (rowVal != '.' && row[rowVal - '1']++ == 1) return false;

                char colVal = board[j][i];
                if (colVal != '.' && col[colVal - '1']++ == 1) return false;

                char boxVal = board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3];
                if (boxVal != '.' && box[boxVal - '1']++ == 1) return false;
            }
        }
        return true;
    }
}
