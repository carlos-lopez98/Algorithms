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
    //Runtime would be O(n) as you'd be iterating through a list until you reach your element to find
    //No new space needed so O(1) space complexity


    //Solution two - find your element to search using a binary search


    public int binarySearch(int[] ints, int low, int high, int x) {

        //This works because eventually low and high, will be greater/ less than each other
        //so looop breaks
        while(low <= high){

            int mid = ((high - low)/2) + low ;

            //Do not use <= or >= when doing binary search
            if((mid == 0 || ints[mid - 1] < x) && ints[mid] == x ){
                return mid;
            }else if(ints[mid] < x){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        //Return -1 if we don't find the x in the array
        return -1;
    }

    public boolean isMajority(int[] ints, int size, int x){

        int position = binarySearch(ints,0, size - 1, x);

        //No majority element found, couldn't even find x at all
        if(position == -1){
            return false;
        }

        if (position + (size/2) < size - 1 && ints[position] == ints[position + size/2]) {
            return true;
        }

        return false;
    }
}
