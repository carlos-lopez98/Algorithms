package org.example.SortAlgorithms;

public class SelectionSort {


    public static void selectionSortAscendingLeftToRight(int[] array){


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
