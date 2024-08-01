package org.example.strings;

/*
* Given a string write a function to check if it's a permutation of a palindrome.
* A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters.
* The palindrome does not need to be limited to dictionary words. You can ignore casing and non-letter characters.
* */


import java.util.HashMap;

//Clarifying Questions:
//What makes a palindrome? Think of as many examples as you can
//You can ignore casing and non-letter characters - meaning you can remove them
//You can ask what the ASCII set being used will be, giving you a predetermined size for an array
//Or you can use a HashMap?

public class PalindromePermutation {

    //With the function we created, we'll be able to track a character as a value of 0-26
    public static boolean checkPalindromePermutation(String string){


        int[] evenOrOddCount = new int[27];

        for(int i = 0; i < string.length(); i++){
            if(getCharValue(string.charAt(i)) != -1){
                evenOrOddCount[getCharValue(string.charAt(i))]++;
            }
        }

        int oddCounter = 0;

        for(int i = 0; i < evenOrOddCount.length; i++){
            if(evenOrOddCount[i] % 2 == 1){
                oddCounter++;
            }
        }


        return !(oddCounter > 1);
    }





    //This function will return an int value of 0-26, depending on the letter
    private static int getCharValue(char c){

        int A = Character.getNumericValue('A');
        int Z = Character.getNumericValue('Z');

        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        //If it's a letter, it has to fall within one of the below ranges
        //If it's not a letter, it'll fall out of the range, then return -1

        if(Character.getNumericValue(c) <= Z && Character.getNumericValue(c) >= A){
            int value = Character.getNumericValue(c) - A;

            return value;
        }else if(Character.getNumericValue(c) <= z && Character.getNumericValue(c) >= a){
            int value = Character.getNumericValue(c) - a; //If it's a j, you'll have j - a, returns 10

            return value;
        }

        return -1;
    }
}
