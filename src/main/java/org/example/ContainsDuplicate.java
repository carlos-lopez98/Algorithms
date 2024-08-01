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


import java.util.*;

public class ContainsDuplicate {

    //Sort the array, then just check if the next position is equal to the current position
    //If there's any dupes then eventually you'll find it
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == i + 1 && i < nums.length - 1) {
                return true;
            }
        }
        return false;
    }


    public static boolean containsDupSetSolution(int[] nums){
        Set<Integer> intSet = new HashSet<>();

        //Add numbers to set, if dup it won't be added
        for (int num : nums) {
            intSet.add(num);
        }

        if(intSet.size() < nums.length){
            return true;
        }
        return false;
    }
}
