package org.example.hashmaps;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public int countElements(int[] arr) {


        Set<Integer> count = new HashSet<>();

        for(int num : arr){
            count.add(num);
        }

        int counter = 0;

        for(int num : arr){
            if(count.contains(num + 1)){
                counter++;
            }
        }

        return counter;
    }
}
