package org.example.arrays;

/*
 * Given an image that represents a N*N matrix, where each pixel in the image is represented by an integer.
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 * */

public class RotateMatrix {


    //[0, 1, 2, 3]                 [12, 8, 4, 0]
    //[4, 5, 6, 7]         ->>>    [13, 9, 5, 1]
    //[8, 9, 10, 11]               [14, 10, 6, 2]
    //[12, 13, 14, 15]             [15, 11, 7, 3]


    //When you transpose you get the below
    //[0,4,8,12]
    //[1,5,9,13]
    //[2,6,10,14]
    //[3,7,11,15]

    //These are the correct columns, but they're not in the right order
    //To get the flip done you can start performing swaps

    public static void rotateMatrixNotInPlace(int[][] matrix) {

        //First we turn our rows into column along the diagonal up left to down right

        transposeMatrix(matrix);

        //You have one pointer iterating through the rows
        for(int row = 0; row < matrix.length; row++){
            //Here you have two pointers iterating through each row, but in the column positions
         for(int colPositionOne = 0, colPositionTwo = matrix[row].length - 1;
             colPositionOne < colPositionTwo;
             colPositionTwo--, colPositionOne++){

             int temp = matrix[row][colPositionOne];
             matrix[row][colPositionOne] = matrix[row][colPositionTwo];
             matrix[row][colPositionTwo] = temp;
         }
        }
    }


    public static int[][] rotateMatrixInPlace(int[][] matrix) {


        return new int[2][2];
    }


    public static void transposeMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = row; col < matrix[row].length; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }



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
