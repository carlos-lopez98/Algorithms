package org.example.arrays;

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

        //If the last element in the first partition is less than or equal to the first element in the right position
        //That means all of the elements on the left are sorted, since this will happen first -- to individual elements
        if(input[midpoint-1] <= input[midpoint]){
            return;
        }

        int i = start; //0
        int j = midpoint; //1
        int tempIndex = 0;

       int[] temp = new int[end-start]; //2 - the size of the temp array, we're comparing only two elements currently

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

        System.arraycopy(input,i,input,start+tempIndex, midpoint-i);
        System.arraycopy(temp,0, input, start, tempIndex);
    }
}
/**
 * In the mergeSort() function, we are just partitioning the array. The partition is dependent on finding a
 * Midpoint. This midpoint, is used as a new start/ end index, think of it as you're splitting the array into two
 * A left and right array. The base case handles situations where the arrays, finally are partitioned into single
 * Elements, when this happens the function stops recursing, it also stops before the merge function is called.
 *
 *
 *
 */