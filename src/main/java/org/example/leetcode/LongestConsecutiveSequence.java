package org.example.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 * Example 1:
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 *
 * Example 2:
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 *
 * Example 3:
 * Input: nums = [1,0,1,2]
 * Output: 3
 */

//Don't forget to handle duplicates if not you'll keep getting a time limit exceeded
public class LongestConsecutiveSequence {

    public static int returnLongestConsecutiveSequence(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> intSet = new HashSet<>();

        for (int num : nums) {
            intSet.add(num);
        }

        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i -1]){
                continue;
            }

            int counter = 0;

            //If you're not a starting subsequence number
            //Then we can start counting
            if (!intSet.contains(nums[i] - 1)) {
                //If the current number - 1 is not in the set - then this is the start of a new consecutive sequence
                int curr = nums[i];
                counter++;
                //While the set contains the currentNumber + 1 counter goes up by 1, curr is incremented
                //Eventually the set will not contain curr
                while (intSet.contains(curr + 1)) {
                    counter++;
                    curr++;
                }

                //After the while loop you set longest = to counter if it's larger than the current iteration
                longest = Math.max(counter, longest);
            }
        }
        return longest;
    }
}