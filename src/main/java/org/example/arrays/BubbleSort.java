package org.example.arrays;


/*
 *
 * Create sorting methods, that sort descending left to right, descending right to left
 * Create sorting method that sorts descending left to right
 *
 * */

public class BubbleSort {

    int[] intArray = {20, 35, -15, 7, 55, 1, -22};

    public void sortAscendingLeftToRight(int[] array) {

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i =0; i < lastUnsortedIndex; i++){

                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i , i+1);
                }
            }
        }
    }


    private void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        //Basic swapping algorithm
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
