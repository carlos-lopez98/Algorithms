package org.example.arrays;

public class MaximumAverageSubarrayI {

    //Fixed sliding window problem
    //Contiguous subarray gives it away as sliding window
    public double findMaxAverage(int[] nums, int k){
        int r = 0;
        int l = 0;
        double runningSum = 0;
        double maxSum = Double.NEGATIVE_INFINITY;

        while(r < nums.length){
            runningSum += nums[r];

            //We'd only need to calculate the average when we're at a contiguous window of size k
            if(r - l + 1 == k){
                maxSum =  Math.max(runningSum, maxSum);
                runningSum -= nums[l];
                l++;

            }
            r++;
        }

        return  maxSum/k;
    }
}
