package org.example.leetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 * <p>
 * Example 1:
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * <p>
 * Example 2:
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * <p>
 * Example 3:
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 * <p>
 * Constraints:
 * 3 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 */

public class ThreeSum {

    //Intuition is we can steer the sum - if we sort our values
    public List<List<Integer>> threeSum(int[] nums) {

        //Since this solution uses a steer the sum approach we must make sure ou input is sorted
        Arrays.sort(nums);

        //Then we instantiate our output list
        List<List<Integer>> threeSum = new ArrayList<>();

        for(int fixed = 0; fixed < nums.length - 2; fixed++){

            //We can continue if our first pointer runs into a duplicate, as we've already found that
            //Triplet
            if(fixed > 0 && nums[fixed] == nums[fixed - 1]){
                continue;
            }

            //This is our steering portion
            int left = fixed + 1;
            int right = nums.length - 1;

            while(left < right){

                int sum = nums[fixed] + nums[right] + nums[left];

                if(sum == 0){

                    //We have valid triplet
                    threeSum.add(Arrays.asList(nums[fixed],nums[left],nums[right]));

                    //Then we can move both pointers
                    left++;
                    right--;

                    //We use this while loop to skip duplicates
                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(left < right && nums[right] == nums[right + 1])right--;
                }
                //This is the part where the sum is being steered
                //right moves inward if we have a larger than zero value
                else if(sum > 0){
                    right--;
                }else{

                    //Left moves outward if we have a smaller than 0 value
                    left++;
                }
            }
        }

        //Then we return our list of triplets w/ duplicates removed
        return threeSum;
    }
}
