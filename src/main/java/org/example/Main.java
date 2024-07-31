package org.example;

import org.example.arrays.MultiDimensionalArraysOperations;
import org.example.helper.Pair;
import org.example.strings.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 5},
                {4, 5, 6, 8},
                {7, 8, 9, 10},
                {11, 12, 7, 7}
        };

        MultiDimensionalArraysOperations.rotateMatrixClockwise(matrix);
        MultiDimensionalArraysOperations.printArray(matrix);
    }
}