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
        //Return just a top k elements
        int[] topK = new int[k];

        //In order to count frequencies of each num - I can use a frequency counter with a hashmap
        Map<Integer, Integer> freqCounter = new HashMap<>();

        for(int num: nums){
           if(freqCounter.containsKey(num)){
               freqCounter.put(num, freqCounter.get(num) + 1);
           }else{
               freqCounter.put(num, 1);
           }
        }

        List<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(freqCounter.entrySet());

        //Sorts Ascending
        sorted.sort((entryOne, entryTwo) -> entryTwo.getValue() - entryOne.getValue());

        for(int i = 0; i < k; i++){
            topK[i] = sorted.get(i).getKey();
        }

        return topK;
    }
}
