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
public class LongestConsecutiveSequence {

    public static int returnLongestConsecutiveSequence(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        int longestSequence = 1;

        Set<Integer> numSet = new HashSet<>();

        //Turns nums into an int stream -> adds each num to numSet
        //O (n) runtime
        Arrays.stream(nums).forEach((num) -> numSet.add(num));

        //Iterate through nums O(n) runtime
        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            int previous = current - 1;

            //If start of sequence
            if(!numSet.contains(previous)){

                int currentSequence = 1;

                //Start counting sequences
                while(numSet.contains(current + 1)){
                    currentSequence++;
                    current++;
                }
                longestSequence = Math.max(currentSequence, longestSequence);
            }
        }

        return longestSequence;
    }
}
