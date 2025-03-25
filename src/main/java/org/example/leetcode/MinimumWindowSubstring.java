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

        if(t.length() > s.length()){
            return "";
        }

        if(s.equals(t)){
            return s;
        }

        //Will be initialized with all the frequencies in t
        Map<Character, Integer> tFreqMap = new HashMap<>();

        //Will contain all the frequencies within our current window
        Map<Character, Integer> windowFreqMap = new HashMap<>();

        for(char curr: t.toCharArray()){
            tFreqMap.merge(curr,1,Integer::sum);
        }


        int left = 0;
        int right = 0;
        int counter = 0;
        int minLength = Integer.MAX_VALUE; //We set it to max, so that any viable first window will be smaller
        String ans = "";

        while(right < s.length()){
            char curr = s.charAt(right);

            //Checks our current variable - right
            if(tFreqMap.containsKey(curr)){
                windowFreqMap.merge(curr,1,Integer::sum);
                if(windowFreqMap.get(curr) == tFreqMap.get(curr)){
                    counter++;
                    System.out.println("Current = " + curr);
                    System.out.print("Count = " + windowFreqMap.get(curr));
                }
            }

            //Variable window - so while a certain condition is true/ false
            //Shorten our window
            while(counter == tFreqMap.size()){
                char toRemove = s.charAt(left);

                if(minLength > right - left + 1){
                    minLength = right - left + 1;
                    ans = s.substring(left,right + 1);
                }

                left++;


                if (tFreqMap.containsKey(toRemove)) {
                    windowFreqMap.merge(toRemove, -1, Integer::sum);
                    if (windowFreqMap.get(toRemove) < tFreqMap.get(toRemove)) {
                        counter--;
                    }
                }
            }

            //Expands our window at the end
            right++;
        }

        return ans;
    }
}
