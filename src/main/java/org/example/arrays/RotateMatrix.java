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


    //When you transpose you get
    //[0]
    //[ , 5,]
    //[ , ,10]
    //[ , , ,15]



    public static int[][] rotateMatrixNotInPlace(int[][] matrix){


        return new int[2][2];
    }


    public static int[][] rotateMatrixInPlace(int[][] matrix){


        return new int[2][2];
    }
}
