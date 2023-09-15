package org.example.practice;


/*
* Practice for Multi Dimensional Arrays
* */
public class MultiDimensionalArrays {

    //Initialization
    static int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

    public static String printArray(){

        //This prints the address reference to where the array is stored in memory
        return matrix.toString();
    }

    public static void printArrayCorrect(){

        //Outer Loop here is the Row Traversal
        for(int i = 0; i < matrix.length; i++){
            System.out.println("Column " + i);

            //Inner Loop Here is the column traversal
            for(int j=0; j< matrix[0].length; j++){

                System.out.print(" " + matrix[j][i] + " ");
            }
        }
    }


    public static void printIndicesByRow(){

        System.out.println("Print Top");
        System.out.println(matrix[0][0] + " " + matrix[0][1] + " " + matrix[0][2]);

        System.out.println("Print Middle");
        System.out.println(matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2]);

        System.out.println("Print Bottom");
        System.out.println(matrix[2][0] + " " + matrix[2][1] + " " + matrix[2][2]);

    }

    public static void printIndicesByColumn(){

        System.out.println("Print First");
        System.out.println(matrix[0][0] + " " + matrix[1][0] + " " + matrix[2][0]);

        System.out.println("Print Second");
        System.out.println(matrix[0][1] + " " + matrix[1][1] + " " + matrix[2][1]);

        System.out.println("Print Third");
        System.out.println(matrix[0][2] + " " + matrix[1][2] + " " + matrix[2][2]);

    }
}
