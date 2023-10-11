package org.example;

/*
*
* Write a function that takes a string as input and checks whether
* it can be a valid palindrome by removing at most one character from it.
*
* */

public class ValidePalindromeII {

    //You're going to have two pointers
    //One will start at the end, one at the beginning
    //If you run into characters that don't match, then you're going to
    //Check each substring, you're going to check a substring without the character at position one
    //THen check the substring without the character at position two
    //If either return true, then a solution is possible, if both return false, then a solution
    //is not possible


    public boolean checkOneDeletion(String s){
        int start = 0;
        int end = s.length() - 1;

        while(start <= end){

            if(s.charAt(start) != s.charAt(end)){

                return isPalindrome(s.substring(start + 1, end+1)) || isPalindrome(s.substring(start, end));
            }

            //Move Pointers Inward
            start++;
            end--;
        }
        return true;
    }


    public boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
