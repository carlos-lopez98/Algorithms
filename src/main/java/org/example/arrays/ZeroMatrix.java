package org.example.arrays;

/**
 * Write an algorithm such that if an element in an M x N matrix is 0
 * its entire row and column are set to 0.
 */
public class ZeroMatrix {

    //The one thing you have to consider for this one is if you iterate through the array
    //Then run into a zero then immediately after set the row and column to zero
    //You'll run into a zero, that you placed there, unintentionally zeroing out even more rows/ columns
    public static void zeroMatrix(int[][] matrix){

        //How can we keep track of the zeroes we find in the matrix?
        //Do we need to keep track of the exact position? Or can we just keep track of the row/ column position?

        //If a column has a zero, we'll set that column position to True
        boolean[] colWithZero = new boolean[matrix[0].length];

        //Doing the same thing but with rows
        boolean[] rowWithZero = new boolean[matrix.length];


        //Checking to see what columns need to zero out
        //We perform this check, because if we do it right after
        //Finding the zero, we may unintentionally zero out too many rows/ columns
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    colWithZero[j] = true;
                    rowWithZero[i] = true;
                }
            }
        }

        //Zeroes out the rows
        for(int i = 0; i < matrix.length; i++){
            if(rowWithZero[i]){
               for(int j = 0; j < matrix[i].length; j++){
                   matrix[i][j] = 0;
               }
            }
        }

        //Zeroes out the columns
        for(int i = 0; i < matrix[0].length; i++){
            if(colWithZero[i]){
             for(int j = 0; j < matrix.length; j++){
                 matrix[j][i] = 0;
             }
            }
        }
    }
}
