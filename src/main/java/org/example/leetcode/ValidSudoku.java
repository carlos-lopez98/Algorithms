package org.example.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need
 * to be validated according to the following rules:
 * <p>
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 * <p>
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 */
public class ValidSudoku {

    public static boolean isValidBoard(char[][] board) {

        //Array of 9 sets per each object - the sets are also objects and are currently null
        Set<Integer>[] uniqueInRow = new Set[9];
        Set<Integer>[] uniqueInCol = new Set[9];
        Set<Integer>[] uniqueInGrid = new Set[9];

        // Initialize the sets - Initializes the sets to empty hashsets
        for (int i = 0; i < 9; i++) {
            uniqueInRow[i] = new HashSet<>();
            uniqueInCol[i] = new HashSet<>();
            uniqueInGrid[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char value = board[i][j];

                if(value == '.'){
                    continue;
                }

                int number = value - '0';
                int gridPosition = i/3 * 3 + (j/3);
                if(uniqueInGrid[gridPosition].contains(number) || uniqueInCol[j].contains(number) || uniqueInRow[i].contains(number)){
                    return false;
                }

                        uniqueInRow[i].add(number);
                        uniqueInCol[j].add(number);
                        uniqueInGrid[gridPosition].add(number);
            }
        }

        return true;
    }
}
