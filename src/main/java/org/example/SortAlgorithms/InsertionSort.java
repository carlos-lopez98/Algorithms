package org.example.SortAlgorithms;


public class InsertionSort {

    //For this one you need to keep track of a sorted partition
    //Let's say we'll start our sorted partition on the left
    //This one implements in Ascending order with the sorted partition on the left, while unsorted is on the right
    public static void insertionSort(int[] intArray) {

        for (int sortedPartition = 0; sortedPartition < intArray.length - 1; sortedPartition++) {
            int unSorted = sortedPartition + 1;
            int innerSorted = sortedPartition;

            //TO NOTE -- While loops do the first condition check then the second
            //It's not they do both
            while (innerSorted >= 0 && intArray[innerSorted] > intArray[unSorted]) {
                int temp = intArray[unSorted];
                intArray[unSorted] = intArray[innerSorted];
                intArray[innerSorted] = temp;
                unSorted--;
                innerSorted--;
            }
        }
    }

    public static void insertionSortDescending(int[] intArray) {

        //Outer loop starts at the lastUnsorted index
        for (int lastUnsortedIndex = 0; lastUnsortedIndex < intArray.length; lastUnsortedIndex++) {
            int innerPointer = lastUnsortedIndex - 1;
            int unSortedPointer = lastUnsortedIndex;

            //Inner Loop iterates through the sorted part of the array
            //Then swaps as needed
            while (innerPointer >= 0 && intArray[innerPointer] < intArray[unSortedPointer]) {
                int temp = intArray[unSortedPointer];
                intArray[unSortedPointer] = intArray[innerPointer];
                intArray[innerPointer] = temp;
                innerPointer--;
                unSortedPointer--;
            }
        }
    }

    //So insertion sort, consists of a window, that we are going to be inserting our element into
    public static void insertionSortFor(int[] intArray) {

        for(int lastWindowPosition = 1; lastWindowPosition < intArray.length; lastWindowPosition++){
            //We have to start at position one, because if we don't we'll get an index out of bounds error
            //Unless we perform an extra if check
            int compareTo = intArray[lastWindowPosition];
            int pointer;
            //lastWindowPosition and pointer - point to the same position
            for(pointer = lastWindowPosition; pointer > 0 && intArray[pointer - 1] > compareTo; pointer--){
                //For this you can do a double if check, so that way you can insert correctly
                //But that will cause the for loop to go all the way through our window
                //It's best to just stop the for loop at the insertion point
                //This will shift elements up
                intArray[pointer] = intArray[pointer - 1];
            }

            //Once we reach the end of our for loop, we can insert our value
            intArray[pointer] = compareTo;
        }
    }

   // int[] newArray = {5, 3, 15, 10, 11, 7, 0};

    //TODO implement descending order with sorted on left and unsorted on right
    public static void sortDescendingSortLeft(int[] arr){
        //Sorted partition will be on the left
       for(int sortedWindowPartition = 0; sortedWindowPartition < arr.length - 1; sortedWindowPartition++){
           int unsortedIndex = sortedWindowPartition + 1;
           int sortedPartitionPointer = sortedWindowPartition;

           while (sortedPartitionPointer >= 0 && arr[unsortedIndex] > arr[sortedPartitionPointer]) {
               int temp = arr[unsortedIndex];
               arr[unsortedIndex] = arr[sortedPartitionPointer];
               arr[sortedPartitionPointer] = temp;
            unsortedIndex--;
            sortedPartitionPointer--;
           }
       }
    }


    //TODO implement ascending order, unsorted on left side, and sorted on right
    public static void sortAscendingUnsortLeftSortRight(int[] arr){
        //Outer loop for sorted partition
        for(int sortedPartition = arr.length - 1; sortedPartition > 0; sortedPartition--){
            //You'll have an element outside of the sorted window you'll be using to compareTo the elements inside the
            //Sorted window
            int compareTo = sortedPartition - 1;

            //Then you need an iterator inside the sortedwindow, to use as the compareTo position
            int innerIterator = sortedPartition;


            //int[] newArray = {5, 3, 15, 10, 11, 7, 0};


            //This is the iterating window
            //If the inneriterator reaches the length of the array end
            //but keep going if the compareTo value and the iterator position meet a certain constraint
            while(innerIterator < arr.length && arr[compareTo] > arr[innerIterator]){

                //Basically this block is just swapping pushing elements as the larger element is put in the correct
                //Position
                int temp = arr[compareTo];
                arr[compareTo] = arr[innerIterator];
                arr[innerIterator] = temp;

                //Both iterators need to be increased as they're moving left to right to make the comparisons
                innerIterator++;
                compareTo++;
            };
        }
    }
    //TODO implement descending order, unsorted on left side, and sorted on right

    public static void sortDescendingUnsortLeftSortRight(int[] arr){

        //Outer loop for sorted partition
        //Inner loop for unsorted partition

        //Variable to hold the compareTo element
        //Variable to iterate within the sorted partition
        //Variable to perform the swapping - so temp variable

        for(int sorted = arr.length - 1; sorted > 0; sorted--){
            int compareTo = sorted - 1;
            int iterator = sorted;
            while(iterator <= arr.length && arr[compareTo] < arr[iterator]){
                int temp = arr[compareTo];
                arr[compareTo] = arr[iterator];
                arr[iterator] = temp;

                iterator++;
                compareTo++;
            }
        }
    }

    //TODO implement using two for loops instead of while loop
}

/**
 *
 * With insertion sort, you need to basically create a window/ gap you can call it
 * This window, will be where you insert your elements
 *
 * In order to do this, you'll have one for loop to iterate your window, and another for loop to iterate through
 * Your window, when iterating through your window you'll shift elements up, depending on your comparison condition
 * Then you can insert your element, but in order to insert, you need to remember to keep your element
 * Saved within a value, or else, you won't be able to insert it, as you're iterator is moving through your window
 */
