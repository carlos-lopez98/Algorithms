package org.example;

/*
* Given a string write a function to check if it's a permutation of a palindrome.
* A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters.
* The palindrome does not need to be limited to dictionary words. You can ignore casing and non-letter characters.
* */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//In order for the string, to be able to become a palindrome, there must be one unique letter, and the rest must be 2's
public class PalindromPermutation {


    public boolean algoOne(String string){
        //Filters out all characters not a throug z and not A through Z
        String refactored = string.toLowerCase().replaceAll("[^a-z]", "" );

        Map<Integer, Character> characterMap = new HashMap<Integer, Character>();

        for(int i = 0; i < refactored.toCharArray().length; i++){
            characterMap.put(i, refactored.toCharArray()[i]);
        }

        characterMap.put()



      return false;
    }
}
