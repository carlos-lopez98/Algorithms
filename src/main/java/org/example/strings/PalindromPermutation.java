package org.example.strings;

/*
* Given a string write a function to check if it's a permutation of a palindrome.
* A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters.
* The palindrome does not need to be limited to dictionary words. You can ignore casing and non-letter characters.
* */


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//Clarifying Questions:
//What makes a palindrome? Think of as many examples as you can
//You can ignore casing and non-letter characters - meaning you can remove them

public class PalindromPermutation {

    public static boolean checkPalindromePermutation(String string){



        return false;
    }

    //This will return a value of 0-26 for alphabetical characters
    //It will return a value of -1, for nonalphabetical characters
    //In our checkPermutation function we can ignore if the value returned is -1
    private static int getCharVaue(char c){
        //Create the integer range
        //Numerical value 'a' - 'z'
        //Numerical value 'A' - 'Z'

        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int A = Character.getNumericValue('A');
        int Z = Character.getNumericValue('Z');

        int val = Character.getNumericValue(c);

        if(val <= z && val >= a){
            return val - a;
        }else if(val <= Z && val >= A){
            return val - A;
        }

        return -1;
    }
}
