package org.example.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need
 * to be validated according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 *
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 */
public class ValidSudoku {

    public static boolean isValidBoard(char[][] board){

        Set<Integer>[] uniqueInRow = new HashSet<>();
        Set<Integer>[] uniqueInCol = new HashSet<>();
        Set<Integer>[] uniqueInGrid = new HashSet<>();


        for(int i = 0; i < 9; i++){
            for(int j =0; j < 9; j++){






            }
        }


        return true;
    }
}
