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
}
