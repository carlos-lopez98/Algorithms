package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 *
 * In other words, return true if one of s1's permutations is the substring of s2.
 *
 * Example 1:
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 *
 * Example 2:
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 *
 * Constraints:
 * 1 <= s1.length, s2.length <= 104
 * s1 and s2 consist of lowercase English letters.
 */

public class PermutationInString {


    //Edge cases, if S1 is larger than S2 then obviously s2 can't contain a permutation of S1
    //Check if the initial frequency maps are = to each other
    public static boolean doesContainPermutation(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }


        //The permutation has to be of size s1.length

        int windowSize = s1.length();
        int left = 0;
        int right = s1.length() - 1;

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];


        for(int i = 0; i < s1.length(); i++){
            s1Freq[s1.charAt(i) - 'a'] += 1;
            s2Freq[s2.charAt(i) -'a'] += 1;
        }

        if(Arrays.equals(s1Freq, s2Freq)){
            return true;
        }


        while (right < s2.length()) {

            if(Arrays.equals(s1Freq, s2Freq)){
            return true;
            }

            s2Freq[s2.charAt(left) - 'a'] -= 1;
            left++;


            if(right +1 < s2.length()){
                right++;
                s2Freq[s2.charAt(right) - 'a'] +=1;
            }else {
                break;
            }

        }
        return false;
    }
}
