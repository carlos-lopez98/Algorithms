package org.example.leetcode;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of
 * the squares of each number sorted in non-decreasing order.
 *
 * Example 1:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 *
 * Example 2:
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 * Constraints:
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.
 */
public class SquaresOfASortedArray {


    //This works because the array is sorted
    //The largest square will either be the leftmost value or right most value
    //Then we can insert into our new array from right to left
    public int[] sortedSquares(int[] nums){
     int[] returnArr = new int[nums.length];

     int left = 0;
     int right = nums.length-1;

     int rightNew = returnArr.length - 1;

     while(left <= right){
         int square;

         if(Math.abs(nums[left]) > Math.abs(nums[right])){
             square = nums[left];
             left++;
         } else{
             square = nums[right];
             right--;
         }

         square = square * square;
         returnArr[rightNew] = square;
         rightNew--;
     }

        return returnArr;
    }
}
