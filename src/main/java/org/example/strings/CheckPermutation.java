package org.example.strings;

import java.util.*;

/*
* Given two strings write a method to decide if one is a permutation of the other
*
* This means one string must have all characters in the other string
* */


public class CheckPermutation {

    //Questions:
    //What is the character set of the strings being used? ASCII character set only 128 characters
    //Is "Dog" a permutation of "god"? Does casing matter? Casing does matter so "Dog" is not a permutation of "god"
    //Do spaces matter? is "dog  " a permutation of "god    "? yes, spaces matter, so no need to handle extra spaces/ non-alphabetical characters

 public static boolean checkStringPermutation(String stringOne, String stringTwo) {
     //You can create a HashMap, iterate through stringOne and adding a count for all characters

     //Iterate through the second string subtracting the count for every character, then checking if any space is less than 0
     // if true return false


     HashMap<Integer, Integer> characterCountMap = new HashMap<>();

     for(int i = 0; i < stringOne.length(); i++){
         int key = stringOne.charAt(i);
         characterCountMap.merge(key, 1, Integer::sum);
     }

     for(int j = 0; j < stringTwo.length(); j++){
         int key = stringTwo.charAt(j);
         characterCountMap.merge(key, -1,Integer::sum);

         if(characterCountMap.get(key) < 0){
             return false;
         }
     }

     return true;
 }
}
