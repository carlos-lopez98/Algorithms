package org.example.leetcode;

public class PivotIndex {

    public int pivotIndex(int[] nums){

        if (nums.length == 1){
            return -1;
        }

        int sum = 0; int leftSum = 0;

        for(int x: nums) sum+= x;

        for(int i = 0; i < nums.length; i++){

            if(leftSum == sum - nums[i] - leftSum){
                return i;
            }
            leftSum += nums[i];
        }


        return -1;
    }
}
