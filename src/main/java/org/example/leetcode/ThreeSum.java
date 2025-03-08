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

        Arrays.sort(nums); //returns sorted array
        List<List<Integer>> threeSum = new ArrayList<>();

        for(int fixed = 0; fixed < nums.length; fixed++){

            int left = fixed +1;
            int right = nums.length-1;

            if(fixed > 0 && nums[fixed] == nums[fixed - 1]){
                continue;
            }

            while (left < right){
                int sum = nums[fixed] + nums[left] + nums[right];

                if(sum == 0){
                    threeSum.add(new ArrayList<>(Arrays.asList(nums[fixed], nums[left], nums[right])));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) left++; //Skipping duplicates
                    while (left < right && nums[right] == nums[right +1]) right--; // skips duplicates
                }else if (sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }


        return threeSum;
    }
}
