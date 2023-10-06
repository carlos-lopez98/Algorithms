package org.example.arrays;


/*
 *
 * Create sorting methods, that sort descending left to right, descending right to left
 * Create sorting method that sorts descending left to right
 *
 * */

public class BubbleSort {


    public static void sortAscendingLeftToRight(int[] intArray) {

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i =0; i < lastUnsortedIndex; i++){

                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i , i+1);
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
