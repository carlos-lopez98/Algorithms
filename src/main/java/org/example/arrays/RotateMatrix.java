package org.example.arrays;

/**
 * Given an image that represents a N*N matrix, where each pixel in the image is represented by an integer.
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 * */

public class RotateMatrix {


    //[0, 1, 2, 3]                 [12, 8, 4, 0]
    //[4, 5, 6, 7]         ->>>    [13, 9, 5, 1]
    //[8, 9, 10, 11]               [14, 10, 6, 2]
    //[12, 13, 14, 15]             [15, 11, 7, 3]

    //[0,4,8,12]
    //[1,5,9,13]
    //[2,6,10,14]
    //[3,7,11,15]


    //When rotating a matrix, you need to think about what exactly is being done
    //If you notice from the above, you can see one thing, the rows become columns
    //Turning rows into columns is a basic matrix manipulation
    //Transpose, transposing will turn rows into columns, over the diagonal, left to right axis
    public static void rotateMatrix(int[][] matrix) {


    }



    public static void transposeMatrix(int[][] matrix) {

    }

    public static void printArray(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
