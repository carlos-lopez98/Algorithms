package org.example.leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
* Given an array of integers nums and an integer target, return indices of the
* two numbers such that they add up to target.
* You may assume that each input would have exactly one solution,
* and you may not use the same element twice.
* You can return the answer in any order.
* */
public class TwoSum {
    //Questions:
    //[5,2,4,5,10] -- nums
    // 6 -- target
    //[1,2] == [2,4] -- return positions not the numbers

    public static int[] twoSum(int[] nums, int target) {



}


//Runtime Complexity O(n^2), Space Complexity O(1)







//    public int[] twoSum(int[] nums, int target) {
//
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < nums.length; i++){
//            int compliment = target - nums[i];
//            map.put(compliment, i);
//        }
//
//        for(int j = 0; j < nums.length; j++){
//            if(map.containsKey(nums[j]) && map.get(nums[j]) != j){
//                int complimentIndex = map.get(nums[j]);
//
//                return new int[]{j, complimentIndex};
//            }
//        }
//
//        return new int[2];
//    }