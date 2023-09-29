package org.example;

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
    }
}
