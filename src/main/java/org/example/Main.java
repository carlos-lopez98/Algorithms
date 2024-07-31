package org.example;

import org.example.arrays.MultiDimensionalArraysOperations;
import org.example.arrays.ZeroMatrix;
import org.example.helper.Pair;
import org.example.strings.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {0, 2, 3},
                {4, 5, 6},
                {7, 8, 0}

        };

        ZeroMatrix.zeroMatrix(matrix);
        MultiDimensionalArraysOperations.printArray(matrix);
    }
}