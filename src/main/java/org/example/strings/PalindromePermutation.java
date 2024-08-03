package org.example.strings;

/*
* Given a string write a function to check if it's a permutation of a palindrome.
* A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters.
* The palindrome does not need to be limited to dictionary words. You can ignore casing and non-letter characters.
* */


import java.util.HashMap;

//Clarifying Questions:
//Firsty what makes a palindrome? Each letter must have a pair, in order for a letter to have a pair
//It must be even, there can only be one letter that has a non-pair
//To ignore non-letter characters you can create a way to remove them as well as ignore the casing

public class PalindromePermutation {

    public static boolean checkPalindromePermutation(String string) {



        int[] characterCounter = new int[27];

        for(int i = 0; i < string.length(); i++){
            int curr = getNumericalValue(string.charAt(i));

            //Keeps track of the character counts in the string
            characterCounter[curr]++;
        }

        int oddCount = 0;

        for(int count: characterCounter){
            if(count % 2 == 1){
                oddCount++;
            }
        }


        return !(oddCount > 1);
    }

    //Function returns a number from 0 - 26 depending on what letter is being passed in
    //Any non-letter characters are going to be ignored, including spaces and what not
    public static int getNumericalValue(char c){

        int A = Character.getNumericValue('A');
        int Z = Character.getNumericValue('Z');
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        int curr = Character.getNumericValue(c);

        if(curr <= Z && curr >= A){
            return curr - A;
        } else if(curr <= z && curr >= a){
            return curr - a;
        }

        return -1;
    }
}