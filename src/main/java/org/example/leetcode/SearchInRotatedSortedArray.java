package org.example.leetcode;

/**
 * There is an integer array nums sorted in ascending order (with distinct values).
 *
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k
 * (1 <= k < nums.length) such that the resulting array is
 * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example,
 * [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 *
 * Given the array nums after the possible rotation and an integer target, return the index of
 * target if it is in nums, or -1 if it is not in nums.
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 *
 * Example 2:
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 *
 * Example 3:
 * Input: nums = [1], target = 0
 * Output: -1
 */
public class SearchInRotatedSortedArray {

    public static int findIndex(int[] nums, int target){
        if(nums.length == 1 && nums[0] != target){
            return -1;
        }


        int left = 0, right = nums.length - 1;


        while (left <= right){

            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                return mid;
            }


            //Right is sorted
            if(nums[mid] <= nums[right]){
                //Check if element is within sorted range
                if(nums[mid] < target && target <= nums[right]){
                    //If it is shrink down to right side
                    left = mid + 1;
                }else{
                    //If it isn't means it's on the left side
                    right = mid - 1;
                }
            } else {
                //it means the left side is sorted
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
