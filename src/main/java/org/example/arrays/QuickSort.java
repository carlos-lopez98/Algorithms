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

        //This first element is our pivot and is stored
        int pivot = input[start];

        int i = start;
        int j = end;

        while (i < j){

            //This is an empty loop body, it gets our j index to the first element smaller than the pivot
            for(;input[j] >= pivot; j--){};

            if(i < j){
                //Since our first element is the pivot point
                //We don't have to worry about losing the first input[i] as we've saved it in pivot
                input[i] = input[j];
            }


            for(; input[i] <= pivot; i++);
            if(i < j){
                input[j] = input[i];
            }
        }

        return i;
    }
}
/**
 * We will basically divide and conquer our array/ structure
 * based on a pivot element
 *
 * Anything less than the pivot will go left anything larger will go right
 * You do this recursively enough times and you get a sorted array
 */