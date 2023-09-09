package org.example;

import java.util.*;

/*
* Given two strings write a method to decide if one is a permutation of the other
*
* This means one string must have all characters in the other string
* */
public class CheckPermutation {


 public static boolean algoOne(String stringOne, String stringTwo){


     if(stringOne.length() != stringTwo.length()){
         return false;
     }

     Set<Character> characterMap = new HashSet<Character>();

     for(char current: stringOne.toLowerCase().toCharArray()){
         characterMap.add(current);
     }

     for(int i = 0; i < stringTwo.length(); i++){
         if(!characterMap.contains(stringTwo.toLowerCase().charAt(i))){
             return false;
         }
     }
     return true;
 }
}
