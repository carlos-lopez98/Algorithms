package org.example;

import java.util.*;

/*
* Given two strings write a method to decide if one is a permutation of the other
*
* This means one string must have all characters in the other string
* */

//Questions to ask:
//Do whitespaces matter?
//What ASCII set is the string based off?
//What about case sensitive? Is GOD a permutation of dog?
public class CheckPermutation {

    //Space complexity for this one is O(1)
    //Runtime is O(1)

 public static boolean algoOne(String stringOne, String stringTwo){
     //Assuming whitespaces matter, then strings not of same lengths will return false
     if(stringOne.length() != stringTwo.length()){
         return false;
     }

     HashMap<Integer, Integer> valueMap = new HashMap<>();

     for(int i = 0; i < stringOne.length(); i++){
         //So if the key is not in the hashmap, then it will put the value 0
         int tempKey = stringOne.charAt(i);
         valueMap.putIfAbsent(tempKey, 0);
         valueMap.merge( tempKey, 1, Integer::sum);
     }

     for (int j = 0; j < stringTwo.length(); j++){

         int tempKey = stringTwo.charAt(j);
         valueMap.putIfAbsent(tempKey, 0);

         valueMap.merge(tempKey, -1, Integer::sum);

         if (valueMap.get(tempKey) < 0){
             return false;
         }
     }

     return true;
 }

    //You can also solve this just by sorting the strings, then checking if they are equal to each other
    //The sorting algorithm runs at O(n log n)
    public static boolean algoTwo(String one, String two){

      char[] arrayOne = one.toCharArray();
      char[] arrayTwo = two.toCharArray();


      Arrays.sort(arrayOne);
      Arrays.sort(arrayTwo);


     return Arrays.toString(arrayOne).equals(Arrays.toString(arrayTwo));
    }
}
