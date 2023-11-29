package org.example;

/*

Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

 */


import java.util.HashMap;

public class ContainsDuplicate {

    //Iterate through the array, adding each value to a HashMap as the key, and the occurrences as a value
    //If the occurrence = 2, return true
    //Else return false at the end of the iteration

    public boolean containsDuplicate(int[] nums){

        HashMap<Integer,Integer> intMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

                intMap.merge(nums[i],1,Integer::sum);

            if(intMap.get(nums[i]) == 2){
                return true;
            }
        }

        return false;
    }
}
