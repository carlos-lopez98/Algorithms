package org.example;

import java.util.*;

/*
* Given two strings write a method to decide if one is a permutation of the other
*
* This means one string must have all characters in the other string
* */

//Questions to ask:
//Do whitespaces matter? Would "Dog  " be a permutation of "goD" -- no spaces do matter
//What ASCII set is the string based off?
//What about case sensitive? Is GOD a permutation of dog?
public class CheckPermutation {

    //Space complexity for this one is O(1)
    //Runtime is O(1)

 public static boolean algoOne(String stringOne, String stringTwo){
        if(stringOne.length() != stringTwo.length()) {
            return false;
        }

        //Then you just check if the remaining strings are equal
        HashMap<Integer, Integer> isPermutationMap = new HashMap<>();

        //You can use a hashmap, then add to the value, while you use the charAt ASCII value as the key
        for(int i = 0; i < stringOne.length(); i++){
            int key = stringOne.charAt(i);

            //If the key is not in the Map yet, then set default to 0
            isPermutationMap.putIfAbsent(key, 0);

            isPermutationMap.merge(key, 1, Integer::sum);
        }

        //Now you use the same map, but subtract 1 instead of adding to the value in the hashmap
        for(int j = 0; j < stringTwo.length(); j++){
            int key = stringTwo.charAt(j);

            if(!isPermutationMap.containsKey(key)){
                return false;
            }

            isPermutationMap.merge(key, -1, Integer::sum);

            if(isPermutationMap.get(key) < 0){
                return false;
            }
        }
        return true;
 }

    //You can also solve this just by sorting the strings, then checking if they are equal to each other
    //The sorting algorithm runs at O(n log n) -- this is because of the sorting
    public static boolean algoTwo(String one, String two){

     char[] sortedOne = one.toCharArray();
     char[] sortedTwo = two.toCharArray();

     Arrays.sort(sortedTwo);
     Arrays.sort(sortedOne);

        return Arrays.toString(sortedOne).equals(Arrays.toString(sortedTwo));
    }
}
