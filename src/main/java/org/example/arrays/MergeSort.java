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

    }
}
