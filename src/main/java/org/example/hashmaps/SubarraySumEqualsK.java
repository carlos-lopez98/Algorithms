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

        //Use the prefix sum trick
        //This one aligns with the two sum solution
        //Where you're looking for a compliment value
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (map.containsKey(sum - k))
                count += map.get(sum - k);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
