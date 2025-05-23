package org.example.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

        Map<Character,Integer> charFreq = new HashMap<Character,Integer>();
        int l = 0;
        int r = 0;
        int longest = 0;
        while(r < s.length()){
            char curr = s.charAt(r);
            charFreq.put(curr, charFreq.getOrDefault(curr, 0) + 1);

            while(charFreq.get(s.charAt(r)) > 1){
                charFreq.put(s.charAt(l), charFreq.get(s.charAt(l)) - 1);
                l++;
            }

            longest = Math.max(longest, r - l + 1);
            r++;
        }

        return longest;
    }
}
