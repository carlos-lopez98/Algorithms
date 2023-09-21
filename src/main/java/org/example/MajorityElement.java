package org.example;

/*
*
* Given a sorted array arr of N elements. A majority element in an array arr of size N is an element that appears more than
* N/2 times in the array. The task is to write a function say isMajority() that takes an array (arr[], array's size(N), and a number
* to be searched X) as parameters and returns true if x is a majority element(present more than N/2 times).
*
* */
public class MajorityElement {
    //The easy way to solve this would be to use logic
    //First off the array is sorted, so if an element has a duplicate it will be adjacent to itself
    //So for every unique element you find you could compare it's current space, to the value of current space + N/2
    //If that value is itself then, you have found your majority element
    //Runtime would be O(n) as you'd be iterating through a list until you reach your majority element
    //No new space needed so O(1) space complexity



}
