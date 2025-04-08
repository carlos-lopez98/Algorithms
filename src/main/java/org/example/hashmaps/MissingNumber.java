package org.example.hashmaps;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public int missingNumber(int[] nums){
        Set<Integer> checkNums = new HashSet<>();

        for(int num : nums){
            checkNums.add(num);
        }

        int expectedRange = nums.length - 1;

        for(int curr = 0 ; curr < expectedRange; curr++){
            if(!checkNums.contains(curr)){
                return curr;
            }
        }

        return expectedRange;
    }
}
