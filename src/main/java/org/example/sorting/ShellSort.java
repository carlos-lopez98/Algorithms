package org.example.sorting;

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

    //{2, 5, 3, 4, 1,7,8,10}
    public static void shellSort(int[] array) {

        //First we choose our gap iteration
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            //Second we iterate starting at gap
            for (int i = gap; i < array.length; i++) {
                //Third we make our comparisons at every gap spaces
                int temp = array[i];

                int j = i;

                //Notice how we're comparing temp to the current location minus gap every time
                //You don't want to compare the current location as you may accidentally compare
                //The wrong values
                while (j >= gap && temp < array[j - gap]) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = temp;
            }
        }
    }


    public static void shellSortDescending(int[] array) {

        //First choose our gap iteration
        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                 int temp = array[i];

                 int j = i;
                 while( j >= gap && temp > array[j - gap]){
                     array[j] = array[j - gap];
                     j -= gap;
                 }

                array[j] = temp;
            }
        }
    }
}

/**
 * Summary:
 * Shell sort is implemented using an external for loop, this is how you'll keep track of your gap
 * Notice how we set gap = to a specific value, then after each iteration we deduct that value at a
 * Specific interval, in this case, we're dividing by two everytime.
 * <p>
 * Then in the second portion of our implementation, we have a shell sort  algorithm, we have an outer loop that starts
 * Comparing values at the gap position, then compares that value at gap intervals, IE we start at position 3 and compare
 * That value to position 0, the comparison is done within the while loop.
 * The while loop also takes care of the shifting, if a value is greater or less than depending on your implementation
 * You'll shift the element up, during this we must take note that our J value is changing, so before our while loop
 * We store the element we're comparing so we don't accidentally compare the wrong values.
 * <p>
 * Some key things to note, are how we're shifting elements by gap in the while loop, we save our compareTo value
 * Into a variable so we don't lose it/ we can keep comparing the new values to the old value and that we have the
 * Insertion point after the while loop handling the comparisons/ shifting
 */
