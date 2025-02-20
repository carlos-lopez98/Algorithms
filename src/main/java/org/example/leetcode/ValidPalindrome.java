package org.example.leetcode;

public class ValidPalindrome {

    public static boolean checkIfPalindrome (String s){

        int start = 0;
        int end = s.length() - 1;

        String compareTo = s.toLowerCase();

        //Creates two pointers one starting at the end, and one at the beginning
        while(start < end){

            //These two while loops ignore the non digit or letter characters
            while(start < end && !Character.isLetterOrDigit(compareTo.charAt(start))){
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
}