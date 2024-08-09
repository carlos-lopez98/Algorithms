package org.example.practice;

public class MergeSort {


    public static void mergeSortAlgo(int[] nums, int start, int end) {

        //Base case, as this is a recursive algorithm
        if (start - end < 2) {
            return;
        }

        int midpoint = (start + end) / 2;

        mergeSortAlgo(nums, start, midpoint);
        mergeSortAlgo(nums, midpoint, end);
        merge(nums, start, midpoint, end);
    }

    public static void merge(int[] nums, int start, int mid, int end) {


    }
}

/**
 * Merge sort is a divide and conquer algorithm so first we need to partition
 */
