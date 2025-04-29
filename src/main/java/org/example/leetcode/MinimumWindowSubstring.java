package org.example.leetcode;


import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t of lengths m and n respectively, return the
 * minimum window substring of s such that every character in t (including duplicates) is
 * included in the window. If there is no such substring, return the empty string "".
 * <p>
 * The testcases will be generated such that the answer is unique.
 * <p>
 * Example 1:
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 * <p>
 * Example 2:
 * Input: s = "a", t = "a"
 * Output: "a"
 * Explanation: The entire string s is the minimum window.
 * <p>
 * Example 3:
 * Input: s = "a", t = "aa"
 * Output: ""
 * Explanation: Both 'a's from t must be included in the window.
 * Since the largest window of s only has one 'a', return empty string.
 * <p>
 * Constraints:
 * m == s.length
 * n == t.length
 * 1 <= m, n <= 105
 * s and t consist of uppercase and lowercase English letters.
 */
public class MinimumWindowSubstring {


        public static String minWindowString(String s, String t) {
            if (s == null || t == null || s.length() < t.length()) return "";

            //You need to know the frequencies of the characters in t
            Map<Character, Integer> tFreq = new HashMap<>();

            for (char c : t.toCharArray()) {
                tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
            }

            //This second window freq map allows us to compare frequencies from the current window
            //To the t substring
            Map<Character, Integer> window = new HashMap<>();
            int have = 0;

            //This need represents the amount of unique characters in t
            //But they'll only count towards have, if the frequency matches as well
            int need = tFreq.size();

            int left = 0;
            int minLen = Integer.MAX_VALUE;
            int minStart = 0;

            for (int right = 0; right < s.length(); right++) {

                //Take the current character at right
                char c = s.charAt(right);
                //Add it to our window frequency
                window.put(c, window.getOrDefault(c, 0) + 1);

                //If that frequency matches our frequency in our t map
                //Then we have met a match so have++
                if (tFreq.containsKey(c) && window.get(c).intValue() == tFreq.get(c).intValue()) {
                    have++;
                }

                //Now when we have a valid window
                //We can check if we have a minimum
                while (have == need) {
                    // update minimum
                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1;
                        minStart = left;
                    }

                    //Then we can shrink by removing the left character
                    char leftChar = s.charAt(left);
                    window.put(leftChar, window.get(leftChar) - 1);

                    //We also must subtract have if the character we're removing is part of t as well
                    if (tFreq.containsKey(leftChar) && window.get(leftChar) < tFreq.get(leftChar)) {
                        have--;
                    }

                    left++;
                }
            }

            return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
        }
    }
