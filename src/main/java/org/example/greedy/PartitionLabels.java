package org.example.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        //Scan string for each character's last occurrence
        Map<Character, Integer> lastChar = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            lastChar.put(s.charAt(i), i);
        }

        int end = 0;
        int size = 0;

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            size++;

            //Will set the end to the last possible character in our partition
            //If we happen to be at that character we're at a partition
            end = Math.max(end, lastChar.get(s.charAt(i)));

            if(i == end){
                result.add(size);
                size = 0;
            }
        }
        return result;
    }
}
