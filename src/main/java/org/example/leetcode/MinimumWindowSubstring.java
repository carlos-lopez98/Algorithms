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
        int counter = 0;

        String ans = "";

        while (right < s.length()) {
            char current = s_arr[right];

            //Expanding window
            //If you run into an element - you subtract it's frequency
            //If the frequency is still above 0, that means you found one character that should be in s from t
            if(--frequency[current] >= 0 ){
                counter++;
            }

            //Shrink window
            //If you reached all the characters that should be t
            //Then start shrinking the window
            while(counter == t.length()){
                int currWindow = right - left + 1;

                if(currWindow < minLen){
                    minLen = currWindow;
                    ans = s.substring(left, right + 1);
                }
                char leftChar = s.charAt(left);

                //You added a character back into frequency
                if(++frequency[leftChar] > 0){

                    //So you can also decrement counter as you freed up an character
                    counter--;
                }
                left++;
            }
            right++;
        }
        return ans;
    }
}
