package org.example.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without duplicate characters.
 * <p>
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * <p>
 * Constraints:
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstringWithoutRepeatingCharacters {


    public static int getLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        //Sliding window technique
        int left = 0;
        int right = 0;
        int longestSequence = 0;

        Set<Character> charSet = new HashSet<>();

        int currentWindow = 1;

        while(right < s.length()){
            char current = s.charAt(right);

            //The key here is where we've put this while loop
            //If our charset contains current, we start removing from the left
            //Before we add our current character
            while(charSet.contains(current)){
                charSet.remove(s.charAt(left));
                left++;
                currentWindow--;
            }

            charSet.add(current);

            longestSequence = Math.max(longestSequence, currentWindow);
            currentWindow++;
            right++;
        }

        return longestSequence;
    }
}
