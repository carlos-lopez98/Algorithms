package org.example.arrays;


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


    }
}
