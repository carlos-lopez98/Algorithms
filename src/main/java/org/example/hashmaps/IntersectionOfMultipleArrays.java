package org.example.hashmaps;

import java.util.*;

public class IntersectionOfMultipleArrays {

    //All numbers in each row are unique
    //This makes it to where we can just use a hashmap
    //Then compare the counts of each unique number and if it equals the amount of rows
    //Then we can add that number to our return list
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                int curr = nums[i][j];

                freqMap.put(curr, freqMap.getOrDefault(curr, 0) + 1);

            }
        }

        List<Integer> result = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            if(entry.getValue() == nums.length){
                result.add(entry.getKey());
            }
        }

        //This is a key part of the problem if we could return unsorted, runtime would be O (mxn)
        Collections.sort(result);

        return result;
    }
}
