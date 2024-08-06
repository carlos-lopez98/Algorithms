package org.example.arrays;

/**
 * Shell sort is an algorithm used for sorting
 * <p>
 * Shell sort can be used as an extension of bubble/ insertion sort
 * <p>
 * It uses a gap value to handle the insertions/ swaps
 */

public class ShellSort {
    //TODO Implement left to right ascending/ descending
    //TODO Implement right to left ascending/ descending

    //Choose a gap iteration?

    public static void shellSort(int[] array) {
        //When working on a shell sort implementation, you need to first decide what your gap value is
        //Different gap values, will give you different run times
        //A good gap value to default to is length of data structure divided by 2

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            //After deciding on the gap, you can proceed to implement the insertion/ bubble sort implmentation
            //**Insertion**

            for (int i = gap; i < array.length; i++) {
                int currentElement = array[i];

                int j = i;

                //After each iteration in the while loop, you may switch the values being compared
                //That's why we store the element to compare inside of currentElement above
                while(j >= gap && currentElement > array[j - gap]){
                    array[j] = array[j-gap];
                    j-=gap;
                }

                //After we finish the while loop iteration
                //This is when we know we're at our insertion point
                //Insert our element into the correct position
                array[j] = currentElement;
            }
        }
    }
}

/**
 * Summary:
 * Shell sort is implemented using an external for loop, this is how you'll keep track of your gap
 * Notice how we set gap = to a specific value, then after each iteration we deduct that value at a
 * Specific interval, in this case, we're dividing by two everytime.
 *
 * Then in the second portion of our implementation, we have a shell sort  algorithm, we have an outer loop that starts
 * Comparing values at the gap position, then compares that value at gap intervals, IE we start at position 3 and compare
 * That value to position 0, the comparison is done within the while loop.
 * The while loop also takes care of the shifting, if a value is greater or less than depending on your implementation
 * You'll shift the element up, during this we must take note that our J value is changing, so before our while loop
 * We store the element we're comparing so we don't accidentally compare the wrong values.
 *
 * Some key things to note, are how we're shifting elements by gap in the while loop, we save our compareTo value
 * Into a variable so we don't lose it/ we can keep comparing the new values too the old value and that we have the
 * Insertion point after the while loop handling the comparisons/ shifting
 */
