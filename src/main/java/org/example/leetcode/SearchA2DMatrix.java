package org.example.leetcode;

/**
 * 74. Search a 2D Matrix
 *
 * You are given an m x n integer matrix {matrix} with the following two properties:
 *
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 *
 * You must write a solution in O(log(m * n)) time complexity.
 *
 *
 * Input:
 * {1,  3, 5, 7}
 * {10,11,16,20}
 * {23,30,34,60}
 *
 *
 * target is 10
 *
 *  0  0  0  0   1   1   1   1   2   2   2   2
 * {1, 3, 5, 7, 10, 11, 16, 20, 23, 30, 34, 60}
 *
 *
 * {1, 2}
 *
 * {0, 3}
 *
 * {1, 1}
 *
 */


public class SearchA2DMatrix {

    public static boolean BSTMatrix(int[][] matrix, int target){

        int cols = matrix[0].length;
        int rows = matrix.length;

        int leftMost = 0;

        int rightMost = cols * rows - 1; //11


        while (leftMost < rightMost){

            int midpointFlat = leftMost + (rightMost - leftMost) /2; // 5

            int midR = midpointFlat/cols;
            int midC = midpointFlat % cols;

            int compareTo = matrix[midR][midC]; // 11

            if( compareTo == target){
                return true;
            } else if (compareTo < target){
                //move left

                rightMost = midpointFlat - 1;


            }else if (compareTo > target){

                leftMost = midpointFlat + 1;
                //move right
            }

        }

        return false; // Target not found
    }
}
