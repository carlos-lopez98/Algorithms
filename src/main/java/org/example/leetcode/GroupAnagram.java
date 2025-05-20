package org.example.leetcode;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 *Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * Explanation:
 * There is no string in strs that can be rearranged to form "bat".
 * The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
 * The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 *
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 *
 * Constraints:
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lowercase English letters.
 */

//The key here is to remember you must create a hashmap
    //Then use the sorted version of each string as the key
    //The key returns a list of the unsorted values
public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> groupAnagramTracker = new HashMap<>();

        for (String currentString : strs) {
            char[] sortedString = currentString.toCharArray();
            Arrays.sort(sortedString);
            String sorted = Arrays.toString(sortedString);

            if (!groupAnagramTracker.containsKey(sorted)) {
                groupAnagramTracker.put(sorted, new ArrayList<>());
            }

            groupAnagramTracker.get(sorted).add(currentString);
        }

        return new ArrayList<>(groupAnagramTracker.values());
    }
}
