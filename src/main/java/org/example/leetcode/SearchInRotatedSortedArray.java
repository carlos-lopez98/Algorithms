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
        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            }

            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                return mid; //index of where mid is
            }

            //This tells you that left side is sorted
            //If nums[mid] target -> that only tells you that nums[mid] is less
            // but that could still be in the left side or right side - you also have to check if target is between
            //nums[left] and nums[mid]
            if(nums[left] <= nums[mid]){

                //This means target is within the left side
                if(nums[left] <= target && target <= nums[mid]){
                 right = mid - 1;
                }else{
                    left = mid + 1;
                }

                //If left side is unsorted - means the right side is sorted
            }else {
                //Right side is sorted
                if(nums[mid] <= target && target <= nums[right]){
                    left = mid +1;
                }else{
                 right = mid - 1;
                }
                //smaller to the right
            }
        }
        return -1;
    }
}
