package org.example;


/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.
 */


public class MaximumSubArray {

    //Return the sum of the largest subarray
    //We don't need to keep track of the indices

    //This will keep track of the maximum sum so far


    //This will keep track of the current running sum
    //When does this get reset is the question

    public int maxSubArray(int[] nums){
        int maxSum = nums[1];
        int currentRunningSum = nums[1];


        for(int i = 1; i < nums.length; i++){

            //This is effectively being our decision maker
            currentRunningSum = Math.max(currentRunningSum + nums[i], nums[i]);

            //This is storing the new max, within maxSum
            maxSum = Math.max(currentRunningSum, maxSum);

        }

        return maxSum;
    }
}
