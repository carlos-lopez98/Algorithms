package org.example.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> lastOccurrence = new HashMap<>();

        for(int i = 0 ; i < s.length(); i++){
            lastOccurrence.put(s.charAt(i), i);
        }

        List<Integer> result = new ArrayList<>();

        int size = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++){
            size++;

            end = Math.max(end, lastOccurrence.get(s.charAt(i)));

            if(i == end){
                result.add(size);
                size = 0;
            }
        }
        return result;
    }
}
