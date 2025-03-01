package org.example.leetcode;

/**
 * Given an integer array nums, return an array answer such that answer[i]
 * is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 *
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 *
 *
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 *
 * Constraints:
 * 2 <= nums.length <= 105
 * -30 <= nums[i] <= 30
 * The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 *
 *
 * Can you solve the problem in O(1) extra space complexity? (The output array does
 * not count as extra space for space complexity analysis.)
 */

public class ProductExceptSelf {


    //The intuition here is that all numbers multiplied on the left of i times all the numbers multiplied on the right of i
    // is our answer. So prefix times suffix = answer for the ith position
    public static int[] productExceptSelf(int[] input){
        int length = input.length;


        int[] leftMult = new int[length];
        int[] rightMult = new int[length];
        int[] result = new int[length];

        //Our left most position doesn't have a prefix
        leftMult[0] = 1;

        //Our right most position doesn't have a suffix
        rightMult[length - 1] = 1;

        //Calculate the multiplication product of all positions left of i
        for(int i = 1; i < length; i++){
            leftMult[i] = leftMult[i - 1] * input[i - 1];
        }

        //Calculate the multiplication product of all position right of i
        for(int i = length -2; i >= 0; i--){

            //At the current position in right mult
            //The suffix should be the previous position in right mult
            //Times the current position in nums
           rightMult[i] = rightMult[i + 1] * input[i + 1];
        }

        //Calculate the answer at each position by multiplying left * right positions
        for(int i = 0; i < length; i++){
            result[i] = leftMult[i] * rightMult[i];
        }

        return result;
    }
}
