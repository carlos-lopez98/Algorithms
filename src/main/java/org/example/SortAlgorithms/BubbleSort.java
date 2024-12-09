package org.example.SortAlgorithms;


/**
 * Create sorting methods, that sort descending left to right, descending right to left
 * Create sorting method that sorts descending left to right
 */

import java.lang.reflect.Array;

public class BubbleSort {

    //Smallest to largest
    public static void sortDescendingLeftToRight(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] < intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
    }

    public static void sortDescendingRightToLeft(int[] intArray) {

        for (int lastUnsortedPartition = 0; lastUnsortedPartition < intArray.length; lastUnsortedPartition++) {
            for (int current = intArray.length - 1; current > lastUnsortedPartition; current--) {
                if (intArray[current] > intArray[current - 1]) {
                    swap(intArray, current, current - 1);
                }
            }
        }
    }

    public static void sortAscendingLeftToRight(int[] intArray) {

        //Outer Loop to keep track of the window
        for(int i = intArray.length - 1; i > 0; i--){
         for (int j = 0; j < i; j++){
             System.out.println("J = " + j);
          if(intArray[j] > intArray[j+1]){
              swap(intArray, j, j+1);
          }
         }
        }
    }

    public static void sortAscendingRightToLeft(int[] intArray) {
        for(int outer = 0; outer < intArray.length - 1; outer++){
            for(int inner = intArray.length-1; inner > outer; inner--){
             if(intArray[inner] > intArray[inner-1]){
                 swap(intArray,inner,inner-1);
             }
            }
        }
    }

    private static void swap(int[] intArray, int currentPosition, int nextPosition) {
        if (currentPosition == nextPosition) {
            return;
        }

        int temp = intArray[currentPosition];
        intArray[currentPosition] = intArray[nextPosition];
        intArray[nextPosition] = temp;
    }
}