package org.example;

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
public class ArraySubset {
    //Will first off, clarifying questions
    //If a2[] is greater does that make it automatically not a subset -- YES


    public boolean isSubset(int[] a1, int[] a2, int sizeN, int sizeM){
        if(a1.length < a2.length){
            return false;
        }

        //Loop through all elements in a2 and check if they are in array 1
        //If we sort a1 we can now perform a binary search on each element
        Arrays.sort(a1);


    }


    public boolean isPresent(int value){
        return binarySearch(value);
    }

    public boolean binarySearch(int value){

    }
}
