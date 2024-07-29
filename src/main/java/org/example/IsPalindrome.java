package org.example;


/*
*
* Check if a given string is a palindrome
*
* */

import java.util.Locale;

//"racecar"
//"poop"
//"tacocat"
//"mom"
public class IsPalindrome {

    //Two pointer
    //"racecar"
    // |     | ==
    //  |   |  ==
    //   | |   ==
    // If they meet, return true
    // If you run into something different, return false


    //Create new string reversed, then compare it to the original string

    //Hashmap - count characters

    public static boolean isPalindrome(String string){

        for(int i = 0, j = string.length() - 1;i < j; i++, j--){
            if(string.charAt(i) != string.charAt(j)){
                return false;
            }
        }

        return true;
    }
}
