package org.example.hashmaps;

import java.util.HashMap;

public class SubarraySumEqualsK {

    //We're basically checking if at every point
    //Our prefix sum - k - is in the array
    //Essentially if we can take our 6 - 3 = 3, if there's already a prefix of 3
    //That means this position is a viable prefix
    public int subarraySum(int[] nums, int k) {

        int count = 0, sum = 0;
        HashMap< Integer, Integer > map = new HashMap <> ();

        //We start the hashmap with a prefix sum of 0 showing up once
        map.put(0, 1);


        for (int i = 0; i < nums.length; i++) {

            //Update prefix sum
            sum += nums[i];

            //If our hashmap contains prefixSum - K
            //Which points to a subArrayPrefix sum that has to have occured, in order for
            //The current ith position to be a valid subarray
            //Then we can increase our counter - as we found another valid contiguous subarray
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
