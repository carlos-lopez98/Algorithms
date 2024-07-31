package org.example.arrays;

/**
 * Write an algorithm such that if an element in an M x N matrix is 0
 * its entire row and column are set to 0.
 */
public class ZeroMatrix {

    //The one thing you have to consider for this one is if you iterate through the array
    //Then run into a zero then immediately after set the row and column to zero
    //You'll run into a zero, that you placed there, unintentionally zeroing out even more rows/ columns
    public void zeroMatrix(int[][] matrix){

        //How can we keep track of the zeroes we find in the matrix?
        //Do we need to keep track of the exact position? Or can we just keep track of the row/ column position?

        //If a column has a zero, we'll set that column position to True
        boolean[] colWithZero = new boolean[matrix[0].length];

        //Doing the same thing but with rows
        boolean[] rowWithZero = new boolean[matrix.length];



    }
}
