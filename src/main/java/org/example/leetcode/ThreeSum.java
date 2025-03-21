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

    //The intuition here is you have to sort in order to steer the sum
    //By that it means that with a sorted nums array, if you're off the target with a smaller number you can move
    //your left pointer forward, but if your target is smaller than you're current position, then you move your rightpointer
    //inward
    public List<List<Integer>> threeSum(int[] nums) {
        //First thing sort the list - which will allow you to steer the sum
        Arrays.sort(nums);

        List<List<Integer>> threeSum = new ArrayList<>(); // This is where you'll store your sum pairs

        for(int fixed = 0; fixed < nums.length - 2; fixed++){

            //Needs to be a while loop or else, it'll just do it once - this ensures we skip all possible duplicates
            while(fixed > 0 && nums[fixed] == nums[fixed - 1]){
                fixed++;
            }

            int left = 0;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[fixed] + nums[right] + nums[left];

                if(sum == 0){
                    threeSum.add(Arrays.asList(fixed,left,right));
                    left++;
                    right--;
                } else if(sum > 0){
                    right--;
                }else{
                    left++;
                }

                while(left > fixed + 1 && nums[left] == nums[left - 1]) left++;
                while(right < nums.length -2 && nums[right] == nums[right + 1])right--;
            }
        }

        return threeSum;
    }
}
