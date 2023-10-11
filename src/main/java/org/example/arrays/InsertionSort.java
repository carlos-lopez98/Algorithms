package org.example.arrays;




public class InsertionSort {

    //For this one you need to keep track of a sorted partition
    //Let's say we'll start our sorted partition on the left
    //This one implements in Ascending order with the sorted partition on the left, while unsorted is on the right
    public static void insertionSort(int[] intArray){

        for(int sortedPartition = 0; sortedPartition < intArray.length - 1; sortedPartition++){
            int unSorted = sortedPartition + 1;
            int innerSorted = sortedPartition;

                //TO NOTE -- While loops do the first condition check then the second
                //It's not they do both
                while(innerSorted >= 0 && intArray[innerSorted] > intArray[unSorted]) {
                    int temp = intArray[unSorted];
                    intArray[unSorted] = intArray[innerSorted];
                    intArray[innerSorted] = temp;
                    unSorted--;
                    innerSorted--;
                }
            }
        }

        public static void insertionSortDescending(int[] intArray){

            //Outer loop starts at the lastUnsorted index
            for(int lastUnsortedIndex = 0; lastUnsortedIndex < intArray.length; lastUnsortedIndex++){
                int innerPointer = lastUnsortedIndex - 1;
                int unSortedPointer = lastUnsortedIndex;

                    //Inner Loop iterates through the sorted part of the array
                    //Then swaps as needed
                    while(innerPointer >= 0 && intArray[innerPointer] < intArray[unSortedPointer]){
                        int temp = intArray[unSortedPointer];
                        intArray[unSortedPointer] = intArray[innerPointer];
                        intArray[innerPointer] = temp;
                        innerPointer--;
                        unSortedPointer--;
                    }
            }
        }


        //TODO implement descending order with sorted on left and unsorted on right
        //TODO implement ascending order, unsorted on left side, and sorted on right
        //TODO implement descending order, unsorted on left side, and sorted on right
        //TODO implement using two for loops instead of while loop
    }

