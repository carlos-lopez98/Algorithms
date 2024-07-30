package org.example.arrays;


import java.util.Arrays;

/*
 * Practice for Multi Dimensional Arrays
 * */
public class MultiDimensionalArraysOperations {

    //Initialization
    static int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};



    //This prints the array correctly
    public static void printArray() {

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void printArrayCorrect() {

        //Outer Loop here is the Row Traversal
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Column " + i);

            //Inner Loop Here is the column traversal
            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(" " + matrix[j][i] + " ");
            }
        }
    }


    public static void printIndicesByRow() {

        System.out.println("Print Top");
        System.out.println(matrix[0][0] + " " + matrix[0][1] + " " + matrix[0][2]);

        System.out.println("Print Middle");
        System.out.println(matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2]);

        System.out.println("Print Bottom");
        System.out.println(matrix[2][0] + " " + matrix[2][1] + " " + matrix[2][2]);

    }

    public static void printIndicesByColumn() {

        System.out.println("Print First");
        System.out.println(matrix[0][0] + " " + matrix[1][0] + " " + matrix[2][0]);

        System.out.println("Print Second");
        System.out.println(matrix[0][1] + " " + matrix[1][1] + " " + matrix[2][1]);

        System.out.println("Print Third");
        System.out.println(matrix[0][2] + " " + matrix[1][2] + " " + matrix[2][2]);

    }

    public static void sumRows() {
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

    public static void sumColumns() {
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
    public static void swapValues(int[][] hello){


    }

    //Transpose matrix, switch rows to columns
    public static void transposeMatrix(int[][] matrix){




    }

    //Rotate the matrix by 90 degrees clockwise
    public static void rotateMatrixClockwise(int[][] matrix){





    }

    //Rotate matrix counter clockwise
    public static void rotateMatrixCounterClockwise(int[][] matrix){



    }
}
