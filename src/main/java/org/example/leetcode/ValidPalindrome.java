package org.example.leetcode;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 * removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */

public class ValidPalindrome {


    //Questions:
    //Is an empty string considered true or false

    public static boolean checkIfPalindrome (String s){

        int start = 0;
        int end = s.length() - 1;

        String compareTo = s.toLowerCase();

        //Creates two pointers one starting at the end, and one at the beginning
        while(start < end){

            //These two while loops ignore the non digit or letter characters
            while(start < end && getNumericalValue(compareTo.charAt(start)) < 0 && getNumericalValue(compareTo.charAt(start)) > 38){
                start++;
            }

            while(start < end && !Character.isLetterOrDigit(compareTo.charAt(end))){
                end--;
            }

            //If the position at start does not equal the position at end - then it's not a palindrome
            if(compareTo.charAt(start) != compareTo.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static int getNumericalValue(char c){

        int a = Character.getNumericValue('a');
        int A = Character.getNumericValue('A');
        int z = Character.getNumericValue('z');
        int Z = Character.getNumericValue('Z');

        if(c <= z && c >= a){
            return c - a;
        }else if( c <= Z && c >= A ){
            return c - A;
        }else if (Character.getNumericValue(c) < 10){
            return 27 + Character.getNumericValue(c);
        }

     return -1;
    }
}