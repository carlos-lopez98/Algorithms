package org.example.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class HouseRobberII {
    public int rob(int[] nums){
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        return Math.max(
                //We can effectively rob two ranges - one without the first house up to the last house
                rob(0, nums.length - 2, nums),

                //One with the first house but only up on to the second to last house
                rob(1, nums.length - 1, nums)
        );
    }

    private int rob(int i, int end, int[] nums){
        if ( i > end) return 0;

        return Math.max(
                rob(i +2, end, nums) + nums[i],
                rob(i + 1, end, nums)
        );
    }
}

//After Memoization
//public int rob(int[] nums){
//    if(nums.length == 0) return 0;
//    if(nums.length == 1) return nums[0];
//
//    Map<Integer, Integer> cacheOne = new HashMap<>();
//    Map<Integer, Integer> cacheTwo = new HashMap<>();
//
//    return Math.max(
//            //We can effectively rob two ranges - one without the first house up to the last house
//            rob(0, nums.length - 2, nums, cacheOne),
//
//            //One with the first house but only up on to the second to last house
//            rob(1, nums.length - 1, nums, cacheTwo)
//    );
//}
//
//private int rob(int i, int end, int[] nums, Map<Integer, Integer> cache){
//    if(cache.containsKey(i)){
//        return cache.get(i);
//    }
//
//    if ( i > end) return 0;
//
//    cache.put(i, Math.max(rob(i +2, end, nums, cache) + nums[i], rob(i + 1, end,nums,cache)));
//
//    return cache.get(i);
//}
