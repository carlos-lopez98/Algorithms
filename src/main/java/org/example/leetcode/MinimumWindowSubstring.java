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

            Map<Character, Integer> tFreq = new HashMap<>();
            for (char c : t.toCharArray()) {
                tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
            }

            Map<Character, Integer> window = new HashMap<>();
            int have = 0;
            int need = tFreq.size();

            int left = 0;
            int minLen = Integer.MAX_VALUE;
            int minStart = 0;

            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);
                window.put(c, window.getOrDefault(c, 0) + 1);

                if (tFreq.containsKey(c) && window.get(c).intValue() == tFreq.get(c).intValue()) {
                    have++;
                }

                while (have == need) {
                    // update minimum
                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1;
                        minStart = left;
                    }

                    char leftChar = s.charAt(left);
                    window.put(leftChar, window.get(leftChar) - 1);

                    if (tFreq.containsKey(leftChar) && window.get(leftChar) < tFreq.get(leftChar)) {
                        have--;
                    }

                    left++;
                }
            }

            return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
        }
    }
