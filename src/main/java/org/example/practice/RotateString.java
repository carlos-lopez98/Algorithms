package org.example.practice;

/**
 * Assume you have a method substring() which checks if one word
 * is a substring of another. Given two strings, s1 and s2, write code to check if s2
 * is a rotation of s1 using only one call to isSubstring()
 * <p>
 * INPUT:
 * "erbottlewat" is a rotation of "waterbottle" return true "bottlewater"  "ttlewaterbo"
 * "bcdea" is a rotation of "abcde" return true
 * "bcade" is not a rotation of "abcde" return false
 */

public class RotateString {


    public static boolean rotateString(String one, String two){
        if(one.length() > two.length() || two.length() > one.length()){
            return false;
        }

        for(int i = 0; i < one.length(); i++){
            if(rotation(one, two, i)){
                return true;
            }
        }
        return false;
    }


    public static boolean rotation(String one, String two, int indexForStart){
        //Int K is set as the starting position for our second pointer
        //Our second pointer is able to start, at different positions depending on the
        //Entry index

        //If our entry is 7 and our length is seven, we'll compare position 0 to 0
        //If our entry is 1 and our length is seven, we'll compare position 0 to 1
        //Etc.. our second pointer switches starting positions, while our first pointer always starts at the same
        //Position
        for(int j = 0, k = indexForStart % two.length(); j < one.length(); j++,k++){

            //Resets K once it hits the final position in it's respective string
            if(k == two.length()){
                k = k % two.length();
            }

            if(one.charAt(j) != two.charAt(k)){
                return false;
            }
        }
        return true;
    }
}
/**
 * One easy way to solve this, would be to add the string to itself
 * Then just check if the second string is within the first string
 *
 * For the elaborate way, you'd have to think of a way for your pointer to be able to start
 * at the correct position within the string
 *
 *
 * Key things to take away from this one, how we started the second pointer in the string, an index % the length
 * This will return a position based on the length of the string, and it's able to start our pointer at a further
 * iteration then the usual 0
 *
 * Also, noticed how we had to reset the second pointer once it reaches the end of it's string, if we don't
 * we'll continue and get an index out of bounds error
 */