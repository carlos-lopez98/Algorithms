package org.example.strings;

/**
 * Assume you have a method substring() which checks if one word
 * is a substring of another. Given two strings, s1 and s2, write code to check if s2
 * is a rotation of s1 using only one call to isSubstring()
 * <p>
 * INPUT:
 * "erbottlewat" is a rotation of "waterbottle" return true "bottlewater"  "ttelwaterbo"
 * "bcdea" is a rotation of "abcde" return true
 * "bcade" is not a rotation of "abcde" return false
 */
public class RotateString {

    public static boolean rotateString(String one, String two) {
        if (one == null || two == null) {
            return false;
        }

        if (one.length() != two.length()) {
            return false;
        }

        //This will be our loop to feed in different starting points to our helper function
        for (int i = 0; i < one.length(); i++) {
            //Let's say the for loop is able to finish, but our splice function never returns true, it's because
            //one of the letters in the sequence was out of order/ is not correct
            if(checkSplice(one,two,i)){
                return true;
            }
        }

        return false;
    }


    public static boolean checkSplice(String one, String two, int insertionPoint) {
        //If we're able to get through the whole for loop, then we have a splice point
        //return true
        for (int i = 0; i < one.length(); i++) {
            if(one.charAt(i) != two.charAt((i + insertionPoint) % two.length())) {
                return false;
            }
        }
        return true;
    }
}
