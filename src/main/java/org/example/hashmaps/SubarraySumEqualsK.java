package org.example.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//This one requires the hashMap trick
//Essentially rightSum - leftSum may equal k
//So if we have rightSum - k in our hashmap
//We've hit a viable subArray so our counter can go up
public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {

        int count = 0, sum = 0;
        HashMap< Integer, Integer > map = new HashMap <> ();

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            //You're basically doing a compliment approach from twosum
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
