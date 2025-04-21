package org.example.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//This one is just a trick
//Based off of a math formula
// n(n+1)/2
public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {

        int count = 0, sum = 0;
        HashMap< Integer, Integer > map = new HashMap <> ();

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            //Uses the prefix sum trick
            //Where prefixSum at right - prefixSumLeft = the sum of a contiguos subarray from right to left
            //If you store every prefix sum up to point i, you can essentially calculate every contiguous subarraysum
            //up to point i - if this contiguous sum = k, then we have a valid subarray
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
