package org.example.arrays;

/**
 * Merge sort is a divide and conquer algorithm
 * Involves two major phases, splitting phase and merging phase
 */

public class MergeSort {



    public static void mergeSort(int[] input, int start, int end){

        //Once our array is one element, we'll return
        if(end - start < 2){
            return;
        }

        //partition array
        int midpoint = (start + end)/2;

        //{ 15, -14, 16, 17, 25, 19, 1, 0, 7, 3, 4, 18, 39}
        //Start will always be zero
        //End will always be inputarray.length
        //The midpoint in this situation becomes the end
        mergeSort(input, start, midpoint);
        //The midpoint in this situation becomes the start
        mergeSort(input, midpoint, end);

        //Let's say you've reached the final single point array
        //Your input will be the array, start, midpoint, and end will all be equal
        merge(input, start, midpoint, end);
    }

    public static void merge(int[] input, int start, int midpoint, int end){

        //If the last element in the first partition is less than or equal to the first element in the right position
        //That means all of the elements on the left are sorted, since this will happen first -- to individual elements
        if(input[midpoint-1] <= input[midpoint]){
            return;
        }

        int i = start;
        int j = midpoint;
        int tempIndex = 0;

       int[] temp = new int[end-start];

       //This will iterate through each partition while storing them in a temporary array
       //When the storing happens, we're also sorting them
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

    }
}
