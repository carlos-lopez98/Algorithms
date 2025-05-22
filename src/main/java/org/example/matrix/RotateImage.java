package org.example.matrix;

//This one just requires matrix transposion + matrix reverse
//You transpose then reverse every row in the matrix
public class RotateImage {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }

    //Transpose to switch rows and columns
    public void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }

    //Then you reverse each row
    public void reverse(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            //Two pointers for swapping is easier to see
            for (int j = 0, k = n -1; j < k; j++, k--) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = tmp;
            }
        }
    }
}
