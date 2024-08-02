package org.example;

import org.example.arrays.*;
import org.example.helper.Pair;
import org.example.practice.Recursion;
import org.example.strings.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[][] matrix = {
//                {0, 2, 3},
//                {4, 5, 6},
//                {7, 8, 0}
//        };
//
//
//
//        RotateMatrix.rotateMatrixNotInPlace(matrix);
//
//        MultiDimensionalArraysOperations.printArray(matrix);


        int[] nums = new int[]{1,2,3,4,5};

        BubbleSort.sortDescendingRightToLeft(nums);

        for(int num: nums){
            System.out.println(num);
        }
    }
}