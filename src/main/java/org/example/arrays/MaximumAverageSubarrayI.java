package org.example.arrays;

//This solution is more intuitive than the nums[right] - nums[right - k]
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

            //You check if you have a new max
            //While your window is equal to size k
            //Otherwise, you might be checking the wrong window
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
