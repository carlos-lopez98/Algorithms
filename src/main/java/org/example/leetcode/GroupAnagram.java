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
public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs){
        //Used to group and track anagrams
        HashMap<String, List<String>> groupAnagramTracker = new HashMap<>();

        //Iterates through your string array
        for (String currentString : strs) {
            //keeps track of current string and it's sorted version
            char[] sortedString = currentString.toCharArray();
            Arrays.sort(sortedString);
            String sorted = Arrays.toString(sortedString);

            //If the sorted version is in the hashmap
            //Add the unsorted in as a value, but using the sorted as a key
            if (!groupAnagramTracker.containsKey(sorted)) {
                groupAnagramTracker.put(sorted, new ArrayList<>());
            }

            groupAnagramTracker.get(sorted).add(currentString);
        }


        //Return the values in the map, as a List of list of strings
        List<List<String>> groupedAnagrams = groupAnagramTracker.values()
                .stream()
                .toList();

        return groupedAnagrams;
    }
}
