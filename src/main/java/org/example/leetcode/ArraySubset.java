package org.example.leetcode;

import java.util.Arrays;

/*
 *
 * Given two arrays: a1[0 ... n-1] of size N, a2[0 ... m -1] of size m
 *
 * Task is to check if a2[] is a subset of a1[].
 *
 * Both arrays may be sorted or unsorted, and there can be duplicate elements
 *
 * */

//TODO come back and implement using hashmap

public class ArraySubset {
    //Will first off, clarifying questions
    //If a2[] is greater does that make it automatically not a subset -- YES


    public boolean isSubset(int[] a1, int[] a2, int sizeN, int sizeM) {
        if (a1.length < a2.length) {
            return false;
        }

        //Loop through all elements in a2 and check if they are in array 1
        //If we sort a1 we can now perform a binary search on each element
        Arrays.sort(a1);

        for(int i = 0; i < a2.length; i++){

            if(!isPresent(a1, a2[i])){
                return false;
            }
        }

        return true;
    }


    public boolean isPresent(int[] array, int toFind) {
        int left = 0;
        int right = array.length - 1;

        return binarySearch(array, left, right, toFind);
    }

    public boolean binarySearch(int[] array, int left, int right, int toFind) {
        int middle;

        while (left <= right) {
            middle = (right - left) / 2 + left;

            if(array[middle] == toFind){

                //This only works if you sort the array, and the array includes no negative values
                array[middle] = -1;
                Arrays.sort(array);
                return true;
            }

            //search left
            if (array[middle] > toFind) {
                right = middle - 1;
            }

            //search right
            if (array[middle] < toFind) {
                left = middle + 1;
            }
        }

        return false;
    }
}



//Another solution to this one would be using a hashset
//Your going to store each value as the key, and it's occurrences as the values
//Whenever you find one you'll subtract from occurrences, if at the end, your second hashset doesn't have all zeroes
//Then that means array 2 is not a subset of array one
