package org.example.sorting;

/**
 * Merge sort is a divide and conquer algorithm
 * Involves two major phases, splitting phase and merging phase
 */

public class MergeSort {



    public static void mergeSort(int[] input, int start, int end){

        if(end - start < 2){
            return;
        }

        int midpoint = (start + end)/2;

        mergeSort(input, start, midpoint);
        mergeSort(input, midpoint, end);
        merge(input, start, midpoint, end);
    }

    public static void merge(int[] input, int start, int midpoint, int end){


        if(input[midpoint-1] <= input[midpoint]){
            return;
        }

        //Here we're basically creating pointers for each left and right array, to compare the values to each other

        int i = start;
        int j = midpoint;
        int tempIndex = 0;

       int[] temp = new int[end-start];

       while(i < midpoint && j < end){
           if(input[i] <= input[j]){
               temp[tempIndex] = input[i];
               i++;
           }else if (input[i] > input[j]){
               temp[tempIndex] = input[j];
               j++;
           }
           tempIndex++;
       }

       //This will copy any remaining elements on the left array, into their correct respective position in
        //The input array
        System.arraycopy(input,i,input,start+tempIndex, midpoint-i);


       //You're copying elements from temp, starting at position 0, to input, starting at position start, and you're
        //You're copying tempIndex elements from position 0, so if tempIndex is 5, you'll copy positions 0 - 4, five
        //Elements
        System.arraycopy(temp,0, input, start, tempIndex);
    }
}
/**
 * In the mergeSort() function, we are just partitioning the array. The partition is dependent on finding a
 * Midpoint. This midpoint, is used as a new start/ end index, think of it as you're splitting the array into two
 * A left and right array. The base case handles situations where the arrays, finally are partitioned into single
 * Elements, when this happens the function stops recursing, it also stops before the merge function is called.
 *
 * The second function is called when returning from the call stack, merge will take care of merging arrays back
 * Together, it'll handle single left and right arrays, consisting of one element first, as it keeps going up the call
 * Stack the left and right arrays will become larger, eventually comparing just comparing left to right, finally
 * Joining back up into a single array.
 * Here we take note of how, we create to indexes, to compare each element in each left and right partition
 * We must at the end copy over any remaining elements in the left array, as they're not in the correct position,
 * Then finally copy over our temp array, back into the correct positions in our input array
 *
 * Runtime: O(n log n)
 * Space Complexity: O (n)
 *
 */