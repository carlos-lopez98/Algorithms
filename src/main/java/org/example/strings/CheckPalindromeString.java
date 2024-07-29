package org.example.strings;

/**
 * Check if the string is palindrome
 */
//Questions:
    //Are we using non-alphabetic characters?
    //Will this be a string without spaces?
    //Does a one letter string count as palindrome?
public class CheckPalindromeString {

    //Assume just alphabetical string, one letter string counts as a palindrome
    public static boolean checkPalindrome(String s){

        char[] stringArrayS = s.toCharArray();
        int middle = stringArrayS.length / 2;

        for(int i = 0, j = stringArrayS.length - 1; i < middle; i++, j--){

            if(stringArrayS[i] != stringArrayS[j]){
                return false;
            }
        }

        return true;
    }
}
