package org.example;

import org.example.arrays.MultiDimensionalArraysOperations;
import org.example.helper.Pair;
import org.example.strings.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        MultiDimensionalArraysOperations.swapValues(matrix, new Pair<>(0,1), new Pair<>(2,2));

        MultiDimensionalArraysOperations.printArray(matrix);
    }
}