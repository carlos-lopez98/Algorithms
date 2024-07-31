package org.example.arrays;


import org.example.helper.Pair;

import java.util.Arrays;

/*
 * Practice for Multi Dimensional Arrays
 * */
public class MultiDimensionalArraysOperations {


    //This prints the array correctly
    public static void printArray(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void printArrayCorrect(int[][] matrix) {

        //Outer Loop here is the Row Traversal
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Column " + i);

            //Inner Loop Here is the column traversal
            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(" " + matrix[j][i] + " ");
            }
        }
    }


    public static void printIndicesByRow(int[][] matrix) {

        System.out.println("Print Top");
        System.out.println(matrix[0][0] + " " + matrix[0][1] + " " + matrix[0][2]);

        System.out.println("Print Middle");
        System.out.println(matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2]);

        System.out.println("Print Bottom");
        System.out.println(matrix[2][0] + " " + matrix[2][1] + " " + matrix[2][2]);

    }

    public static void printIndicesByColumn(int[][] matrix) {

        System.out.println("Print First");
        System.out.println(matrix[0][0] + " " + matrix[1][0] + " " + matrix[2][0]);

        System.out.println("Print Second");
        System.out.println(matrix[0][1] + " " + matrix[1][1] + " " + matrix[2][1]);

        System.out.println("Print Third");
        System.out.println(matrix[0][2] + " " + matrix[1][2] + " " + matrix[2][2]);

    }

    public static void sumRows(int[][] matrix) {
        //Staying in first column, and getting the length of that column, returns row numbers
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Sum Row: " + i);
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
            System.out.println(sum);
        }
    }

    public static void sumColumns(int[][] matrix) {
        //Staying in first row, and getting length of that row, returns column numbers
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("Sum of Column: " + i);
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            System.out.println(sum);
        }
    }

    //Swap values using indexes
    //Takes in a Pair of indices
    public static void swapValues(int[][] matrix, Pair<Integer, Integer> positionOne, Pair<Integer, Integer> positionTwo) {

        int temp = matrix[positionOne.getFirst()][positionOne.getSecond()];

        matrix[positionOne.getFirst()][positionOne.getSecond()] = matrix[positionTwo.getFirst()][positionTwo.getSecond()];
        matrix[positionTwo.getFirst()][positionTwo.getSecond()] = temp;

    }

    //Transpose matrix, switch rows to columns
    //This literally just switches the rows to columns
    //The pointers start at the top left and go all the way till they hit the bottom right corner
    //You can only transpose on the top left to bottom right axis, since those positions cause no swaps, IE 0,0 swapped with 0,0 stays the same, 1,1, and 2,2, 3,3
    public static void transposeMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = row; col < matrix[row].length; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
    }

    //Rotate the matrix by 90 degrees clockwise
    //The method above will help with this problem
    //Transposing your matrix, turns rows into columns, when you rotate a matrix by 90 degrees, you effectively turn all your rows into columns
    //The problem here is when you transpose you don't get the columns into the correct position
    //To correctly position our columns we perform more swaps
    //We can do this by creating two pointers that traverse each row from outer to inner
    public static void rotateMatrixClockwise(int[][] matrix) {
        transposeMatrix(matrix);
        for(int i = 0; i < matrix.length; i++){
         for(int k = 0, j = matrix[i].length - 1; k < j ; k++, j--){
          int temp = matrix[i][j];
          matrix[i][j] = matrix[i][k];
          matrix[i][k] = temp;
         }
        }
    }

    //Rotate matrix counter clockwise
    //To rotate counter clockwise you'll have to adjust how you transpose the matrix
    public static void rotateMatrixCounterClockwise(int[][] matrix) {


    }
}
