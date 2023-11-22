package org.example;


/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.
 */

//What's the bruteforce approach?
public class MaximumSubArray {



    public int maxSubArray(int[] nums) {

        //What are the variables needed for optimal approach?
        int currentRunningSum = 0;
        int globalMaxSum = 0;

        //How many for loops for iteration will you need?
        for(int i = 0 ; i < nums.length; i++){

            currentRunningSum = Math.max(nums[i], currentRunningSum + nums[i]);

            if(currentRunningSum > globalMaxSum){
                globalMaxSum = currentRunningSum;
            }

        }

        //How do we decide when to start a new subArray?


        //When do we update our global sum?

        return globalMaxSum;
    }
}
