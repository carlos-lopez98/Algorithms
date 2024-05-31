package org.example;


import java.util.HashMap;
import java.util.Map;

/*
*
* Given an array of integers nums and an integer target, return indices of the
* two numbers such that they add up to target.
* You may assume that each input would have exactly one solution,
* and you may not use the same element twice.
* You can return the answer in any order.
*
* */


public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

    //You have two approaches, brute force and compliment numbers
    //We'll only iterate once, as we'll be adding the compliment value as we go





        return null;
    }
}



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