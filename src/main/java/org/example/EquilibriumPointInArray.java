package org.example;

/*
* Given a sequence arr[] of size n, Write a function int equilibrium(int[] arr, int n) that returns an
* equilibrium index (if any) or -1 if no equilibrium index exists.
*
* The equilibrium index of an array is an index such that the sum of elements at
* lower indexes is equal to the sum of elements at higher indexes.
* */
public class EquilibriumPointInArray {

    //Find the sum at each index from left to right and save them into a separate array
    //It'll be the same size of the original array
    //Now to get Left sum, it'll be the current sum[i] minus the original array[index] value
    // To get right sum, it'll be total sum - sum up to current iteration i - then you check if they're equal
    //If they are return the current index as it's the equilibrium point
    //If not equal iterate again, until you reach the end of the list - return -1 if no point is found



}
