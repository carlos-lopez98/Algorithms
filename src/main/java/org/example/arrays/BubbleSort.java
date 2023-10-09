package org.example.arrays;


/*
 *
 * Create sorting methods, that sort descending left to right, descending right to left
 * Create sorting method that sorts descending left to right
 *
 * */

import java.lang.reflect.Array;

public class BubbleSort {


    //Largest to smallest -- sort from the left to right
    //Bubble up the largest elements
    public static void sortDescendingLeftToRight(int[] intArray){

    for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

        //You only swap if less, than since you want small values bubbled to the right
        for(int i = 0; i < lastUnsortedIndex; i++){
           if(intArray[i] < intArray[i+1]){
               swap(intArray, i, i+1);
           }
        }
    }
    }

    public static void sortDescendingRightToLeft(int[] intArray){

        for(int lastUnsortedIndex = 0; lastUnsortedIndex < intArray.length; lastUnsortedIndex++){

            //Logic here is that both pointers move inward essentially bubbling up all possible values
            for(int i = intArray.length - 1; i > lastUnsortedIndex; i--){

                //Since we want greater values at the left, the comparison is for if it's greater than
               if(intArray[i] > intArray[i-1]){
                swap(intArray, i , i-1);
               }
            }
        }

    }

    public static void sortAscendingLeftToRight(int[] intArray) {

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i =0; i < lastUnsortedIndex; i++){

                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i , i+1);
                }
            }
        }
    }


    public static void sortAscendingRighToLeft(int[] intArray){

    //Here we basically want our unsorted index to go up to the start point, since we're right to left
    for(int lastUnsortedIndex = 0; lastUnsortedIndex < intArray.length; lastUnsortedIndex++){
        //Pointer moves from right to left, sorting in ascending order from left to right
        for(int i = intArray.length - 1; i > 0; i--){
         if(intArray[i] < intArray[i - 1]) {
             swap(intArray, i, i - 1);
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
