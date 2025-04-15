package org.example.matrix;

import java.util.HashSet;
import java.util.Set;

public class MatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;

        //Instantiate two sets for rows and columns
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> cols = new HashSet<Integer>();

        //Iterate through the grid like normal
        //If we're in a cell with a zero
        //Mark the it's row and column for zeroing out
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        //Now you iterate through the grid again
        //If your at a cell with a column or row set to zero
        //Then we mark that cell as zero
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (rows.contains(i) || cols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
