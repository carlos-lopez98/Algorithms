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
            while(start < end && getNumericalValue(compareTo.charAt(start)) == -1){
                start++;
            }

            while(start < end && getNumericalValue(compareTo.charAt(end)) == -1){
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

        int curr = Character.getNumericValue(c);

        if(curr <= z && curr >= a){
            return curr - a;
        }else if( curr <= Z && curr >= A ){
            return curr - A;
        }else if (curr >= 0 && curr <= 9){
            return 27 + curr;
        }

     return -1;
    }
}