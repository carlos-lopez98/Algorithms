package org.example.leetcode;


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
        if (s.equals(t)) {
            return s;
        }

        if (s.length() == 1 || t.length() == 1) {
            return "";
        }

        int[] frequency = new int[128];
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        //All characters in t must be within window
        for(char cur: t_arr){
            frequency[cur]++;
        }



        int right = 0;
        int left = 0;

        int minLen = Integer.MAX_VALUE;

        String ans = "";

        while (right < s.length()) {


            right++;
        }




        return ans;
    }
}
