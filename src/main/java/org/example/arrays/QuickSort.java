package org.example.arrays;

public class QuickSort {



    public static void quickSort(int[] input, int start, int end){
        //This breaks at of our recursion when are array is one element in length
        //No need to sort/ partition a single element array
        if( end - start < 2){
            return;
        }


        //After partitioning the array, this will return the position where our pivot element was placed
        //This position is effectively sorted already by our partition method
        int pivotIndex = partition(input, start, end);

        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end){




    }
}
/**
 * We will basically divide and conquer our array/ structure
 * based on a pivot element
 *
 * Anything less than the pivot will go left anything larger will go right
 * You do this recursively enough times and you get a sorted array
 */