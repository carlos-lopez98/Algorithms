package org.example.SortAlgorithms;

public class CountingSort {


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