package org.example.matrix;

import java.util.HashSet;
import java.util.Set;

public class MatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;

        //You can create a set to represent rows or columns
        //Then you just add the row# or col# that is affected by a zero
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> cols = new HashSet<Integer>();


        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        //If your current row or column# is affected
        //Change to zero
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (rows.contains(i) || cols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
