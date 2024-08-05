package org.example;

import org.example.arrays.*;
import org.example.helper.Pair;
import org.example.practice.Recursion;
import org.example.strings.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8,9,10,11},
                {12,13,14,15}
        };

        RotateMatrix.rotateMatrix(matrix);
        RotateMatrix.printArray(matrix);
    }
}