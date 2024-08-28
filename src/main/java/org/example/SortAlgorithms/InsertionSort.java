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


    //TODO implement descending order with sorted on left and unsorted on right
    //TODO implement ascending order, unsorted on left side, and sorted on right
    //TODO implement descending order, unsorted on left side, and sorted on right
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
