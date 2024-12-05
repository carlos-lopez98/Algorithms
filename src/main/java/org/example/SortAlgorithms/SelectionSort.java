package org.example.SortAlgorithms;

import java.sql.SQLOutput;

public class SelectionSort {


    public static void selectionSortAscendingLeftToRight(int[] array){
        for(int outer = array.length - 1; outer > 0; outer--){
            int largestIndex = 0;

            for(int inner = 0; inner <= outer; inner++){

                if(array[inner] > array[largestIndex]){
                    largestIndex = inner;
                }

                if(inner == outer){
                    swap(array,largestIndex,inner);
                }
            }
        }
    }


    public static void selectionSortDescendingLeftToRight(int[] intArray) {
        for(int i = 0; i < intArray.length; i++){
            int largestIndex = intArray.length-1;

            for(int j = intArray.length-1; j >= i; j--){


               if(j == i){
                   swap(intArray,largestIndex,j);
               }else if(intArray[j] > intArray[largestIndex]) {
                   largestIndex = j;
               }
            }
        }
    }




    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        //Basic swapping algorithm
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
