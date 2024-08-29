package org.example.SortAlgorithms;

public class CountingSort {




    public static void countSort(int[] input, int min, int max){

        int range = (max - min) + 1; //Plus one is so that we include the last element, think if the range was just max
        //our max element would be left out, think range 0 - 10, if you create an array size ten, you'll leave out 10

        int[] countArray = new int[range];

        //Loops through our input, adding 1 to it's count, in it's respective position
        for(int i = 0; i < input.length; i++){
            //This gives us the respective position within the range
            // IE if range is 50

            countArray[input[i] - min]++;
        }

        for(int num: countArray){
            System.out.print(num + " ");
        };

        //Now that we have the counts of every element from min to max, and they're in the correct order in our countArray
        //We input them bck into our original input array
        int j = 0;

        for(int i = 0; i < countArray.length; i++){
            int element;

            while(countArray[i] > 0){
                element = i + min;
                input[j] = element;
                j++;
                countArray[i]--;
            }
        }
    }
}
/**
 * This Algorithm assumes the elements to be sorted are within a given range.
 *
 * The range will be passed into our method, as a max and min, so the range is max - min
 *
 * With the range included, we can create a temp array that stores the counts of numbers min to max
 *
 * With the counts, we are able to place the elements from min to max back into the input array in the correct order
 *
 * Runtime for this algorithm is O(n), Unstable not in-place, as we need to create a new array, but in-place technically
 * since we're not creating new variables, just keeping track of their counts, so space is O(n) n being the range,
 * So it can be argued that the space is O(1)
 */