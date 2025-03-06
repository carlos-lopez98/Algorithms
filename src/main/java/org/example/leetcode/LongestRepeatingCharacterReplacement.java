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
       if(s.isEmpty()){
           return 0;
       }

       int left = 0;
       int right = 0;

       int longestSequence = 0;
       int currentWindow = 1;

       Map<Character, Integer> frequencies = new HashMap<>();

       int maxFreq = 0;

        //Sliding window technique
        while(right < s.length()){
            char current = s.charAt(right);
            int currentFreq = 0;

            frequencies.merge(current, 1, Integer::sum);

            if(frequencies.containsKey(current)){
                currentFreq = frequencies.get(current);
            }

            //Keeps track of the element that shows up the most in our currentwindow
            maxFreq = Math.max(currentFreq, maxFreq);

            //Operations needed is our current window size - the element that shows up the most
            //If the operations needed are ever more than k - shrink our window
            while(currentWindow - maxFreq > k){
                frequencies.merge(s.charAt(left), -1, Integer::sum);
                left++;
                currentWindow--;
            }



            longestSequence = Math.max(currentWindow, longestSequence);
            right++;
            currentWindow++;
        }

        return longestSequence;
    }
}
