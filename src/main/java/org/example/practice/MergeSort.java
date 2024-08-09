package org.example.practice;

public class MergeSort {


    // {2, 5, 3, 4, 1,7,8,10}
    public static void mergeSortAlgo(int[] nums, int start, int end) {

        //Base case, as this is a recursive algorithm
        if (start - end < 2) {
            return;
        }

        int midpoint = (start + end) / 2;

        //Partition all the way left
        mergeSortAlgo(nums, start, midpoint);

        //Partition all the way right
        mergeSortAlgo(nums, midpoint, end);
        merge(nums, start, midpoint, end);
    }

    public static void merge(int[] nums, int start, int mid, int end) {

        //Creates our temp array, used to store our temp values
        //Size end - start, gives us the correctly sized array
        int[] temp = new int[end - start];






    }
}

/**
 * Merge sort is a divide and conquer algorithm so first we need to partition
 */
