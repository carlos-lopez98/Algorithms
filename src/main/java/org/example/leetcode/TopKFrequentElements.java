package org.example.leetcode;

import java.util.*;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the
 * answer in any order.
 *
 *
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 *
 *
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 */

public class TopKFrequentElements {

    public static int[] topKFrequent (int[] nums, int k){

        HashMap<Integer, Integer> frequencies = new HashMap<>();

        for(int current: nums){
        frequencies.merge(current,1, Integer::sum);
        }

        List<Map.Entry<Integer,Integer>> sortedFreq = new ArrayList<>((frequencies.entrySet()));
        sortedFreq.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());


        int[] returnList = new int[k];
        for(int i = 0 ; i < k; i++){
            returnList[i] = sortedFreq.get(i).getKey();
        }

        return returnList;
    }
}
