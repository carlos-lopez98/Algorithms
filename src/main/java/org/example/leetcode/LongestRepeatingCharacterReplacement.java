package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given a string s and an integer k. You can choose any character of the string and
 * change it to any other uppercase English character. You can perform this operation at most k times.
 *
 * Return the length of the longest substring containing the same letter you can get after
 * performing the above operations.
 *
 * Example 1:
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 *
 * Example 2:
 * Input: s = "AABABBA", k = 1
 * Output: 4
 * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
 * The substring "BBBB" has the longest repeating letters, which is 4.
 * There may exists other ways to achieve this answer too.
 *
 * Constraints:
 * 1 <= s.length <= 105
 * s consists of only uppercase English letters.
 * 0 <= k <= s.length
 */
public class LongestRepeatingCharacterReplacement {


    //k is the maximum allowed of operations
    public static int returnLongestRepeatingCharacter(String s, int k){
    //Edge Case
        if (s.isEmpty()){
            return 0;
        }
    //Initialize variables
    int left = 0;
    int right = 0;
    //This can default to one, since you always start with a window size 1
    int windowSize = 1;
    int longestSequence = 0;
    int[] frequencies = new int[127];
    int maxFreq = 0;

    //While our rightwall is less than length
    while(right < s.length()){
        //This is our current character for readability
        char curr = s.charAt(right);

        //This keeps track of each character within our window and how many times they show up
        frequencies[curr - 'A'] += 1;

        //this is a tracker of the current character's frequency
        int currentFreq = frequencies[curr - 'A'];

        //If the current characters frequency is greater than the maximum running frequency
        //That becomes our new max
        maxFreq = Math.max(currentFreq, maxFreq);

        //If the changes needed is greater than k - means we have to shrink our window
        while(windowSize - maxFreq > k){
            //remove the left most character frequency
            frequencies[s.charAt(left) - 'A'] -=1;

            //Shrink window, while keeping track of the new window's size
            left++;
            windowSize--;
        }

        //Longest sequence will be = to the greater value either window size or the current running longest sequence
        longestSequence = Math.max(windowSize, longestSequence);

        //Grow the window after every iteration
        right++;
        windowSize++;
    }

    return longestSequence;
    }
}
