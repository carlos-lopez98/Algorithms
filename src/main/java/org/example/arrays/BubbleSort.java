package org.example.arrays;


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
                int curr = intArray[i];
                int next = intArray[i + 1];

                if (curr < next) {
                    swap(intArray, i, i + 1);
                }
            }
        }
    }

    public static void sortDescendingRightToLeft(int[] intArray) {

    }

    public static void sortAscendingLeftToRight(int[] intArray) {

    }


    public static void sortAscendingRighToLeft(int[] intArray) {

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
