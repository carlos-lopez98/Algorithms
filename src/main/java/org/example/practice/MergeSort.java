package org.example.practice;

public class MergeSort {
    //Partition the Array - This will be a recursive call
    //On the way back from the call stack, you'll merge

    //Merge function steps
    //1. Only handle merges when the right side is less than the left side, depending on how you're sorting
    //2. Create a temp array - This will store your elements in the correct order for the time being
    //3. You want two pointers - one on the left and one on the right
    // - If the one on the right is less than the one on the left, the one on the right
    // will be placed in the correct position on the temp array - for this you'll need a temp index
    // after the pointer on the right moves forward

    //Lastly, you'll merge your temp array back into the original array, take a moment to think how this will happen
    //You can

    //We want this method to do the partitioning

}

/**
 * Merge sort is a divide and conquer algorithm so first we need to partition the elements all the way down into
 * Single element arrays
 *
 * Once we're there we're start going back up the call stack
 *
 * On the way back we want to merge the arrays back into their correct positions in the original array
 * To do this we must create a temp array, that will store our order correctly, then copy these back into
 * The original array
 *
 * Depending on how we implement our comparisons on the left and right partition, we may have left over elements
 * On the left partition that should be copied over first**
 */
