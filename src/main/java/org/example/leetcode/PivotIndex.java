package org.example.leetcode;

public class PivotIndex {

    public int pivotIndex(int[] nums){

        if (nums.length == 1){
            return -1;
        }

        int sum = 0; int leftSum = 0;

        //First you need your total sum
        for(int x: nums) sum+= x;

        //Then you iterate keeping track of your prefixSum
        for(int i = 0; i < nums.length; i++){

            //This is what determines what your pivotIndex is
            //If your totalSum - current - prefix == prefix
            //Then that means you're at your pivot
            if(leftSum == sum - nums[i] - leftSum){
                return i;
            }

            //Else move forward and update your prefix
            leftSum += nums[i];
        }


        return -1;
    }
}
