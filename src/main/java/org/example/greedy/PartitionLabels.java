package org.example.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {

        //create a hashmap to store each letters last occurrence
        Map<Character,Integer> lastOccurrence = new HashMap<>();

        for(int i = 0 ; i < s.length(); i++){
            lastOccurrence.put(s.charAt(i), i);
        }


        List<Integer> result = new ArrayList<>();

        //You need a size to keep track of the current partition
        int size = 0;

        //Every time your size reaches an end - it means you have a valid partition
        int end = 0;

        for(int i = 0; i < s.length(); i++){
            size++;

            //The key is this little part
            //The end of each partition is denoted by the last occurring element in our partition
            end = Math.max(end, lastOccurrence.get(s.charAt(i)));

            //whenever our I becomes our end
            //It essentially means we reached the end of a valid partition
            //Then we can reset the size
            //end will reset in the next iteration as it has to become a new last occurring spot
            //which logically will be greater than the current last occurring spot
            if(i == end){
                result.add(size);
                size = 0;
            }
        }
        return result;
    }
}
