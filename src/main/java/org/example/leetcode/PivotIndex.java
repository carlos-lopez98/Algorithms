package org.example.leetcode;

public class PivotIndex {

    public int pivotIndex(int[] nums){

        if (nums.length == 1){
            return -1;
        }

        int sum = 0; int leftSum = 0;

        for(int x: nums) sum+= x;

        //Technically you can do this in place, because you don't have to store every prefix
        //You just need to check at every iteration, so O(1) is possible by checking what the prefix sum
        // is at every iteration
        //Key is the math trick on line 21
        for(int i = 0; i < nums.length; i++){

            if(leftSum == sum - nums[i] - leftSum){
                return i;
            }

            leftSum += nums[i];
        }


        return -1;
    }
}
