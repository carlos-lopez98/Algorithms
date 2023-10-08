package org.example.arrays;

public class SelectionSort {




    public static void selectionSortAscendingLeftToRight(int[] array){
        //Outer keeps track of our sorted places
        //Or last unsorted index
    for(int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){

        //This keeps track of our largest index
        int max = 0;

        //This is an inner iteration, looking for our max index
        for(int i = 0; i <= lastUnsortedIndex; i++){
            if(i == lastUnsortedIndex){
                swap(array, max, i);
            }else if(array[i] > array[max]){
                max = i;
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
