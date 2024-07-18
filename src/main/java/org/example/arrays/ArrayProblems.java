package org.example.arrays;


import java.util.HashMap;

/**
 * Practice Problems involving Arrays
 */

public class ArrayProblems {

/**
 * Find the largest three elements in an array
 *
 *   Input: arr[] = {10, 4, 3, 50, 23, 90}
 *   Output: 90, 50, 23
 *   Input: arr[] = { 6, 8, 1, 9, 2, 1, 10, 10}
 *   Output: 10, 10, 9
 */
 public int[] findLargestDistinct(int[] nums){
     int[] intArray = {};


     return intArray;
 }

    /**
     * Given an integer array nums, return true if
     * any value appears at least twice in the array,
     * and return false if every element is distinct.
     * Example 1:
     *
     * Input: nums = [1,2,3,1]
     * Output: true
     * Example 2:
     *
     * Input: nums = [1,2,3,4]
     * Output: false
     * Example 3:
     *
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */

    public boolean containsDuplicate(int[] nums){

        HashMap<Integer, Integer> intMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            intMap.merge(nums[i],1,Integer::sum);

            if (intMap.get(nums[i]) == 2){
                return true;
            }
        }

        return false;
    }
}
