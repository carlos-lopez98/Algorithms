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

    //This one works by putting all the compliment values into the HashMap
    //Then iterates through the array, if the array contains the compliment value and
    //it's not equal to it's same position then return true



    public int[] twoSum(int[] nums, int target){

        //I need to return the indices,not just true or false, if there are two numbers that equal target
        //When it comes to problems like this, you can automatically think compliment
        //You can also think okay let's sort this, if I sort this what happens,the indices go out of wack
        //So sorting is not possible, if we only needed to return true or false we'd be able to sort

        //My first thought is to use a HashMap, that stores not only the compliment but also the index at which that
        //compliment was obtained

        Map<Integer, Integer> intMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

        }
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