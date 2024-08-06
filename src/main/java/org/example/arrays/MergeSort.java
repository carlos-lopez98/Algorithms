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

        mergeSort(input, start, midpoint);
        mergeSort(input, midpoint, end);
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
