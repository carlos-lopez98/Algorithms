package org.example.strings;

import java.util.HashMap;

/**
 * Problem:
 *   There are three types of edits that can performed on strings:
 *   insert a character, remove a character, or replace a character.
 *   Given two strings, write a function to check if they are one edit (or zero edits) away.
 *
 * Example:
 *   pale, ple   -> true
 *   pales, pale -> true
 *   pale, bale  -> true
 *   pale, bake  -> false
 *
 * Solution:
 *   complexity: O(n)
 */

public class OneAway {
    
    //Clarifying Questions:
    //Is pale one away from "p ale"? Do non alphabetical characters count? Yes they count
    //Is it case sensitive? "Pale" "pale" is this one away? Yes one away
    
    public static boolean isOneAway(String one, String two) {
        
        //If the string lengths are larger by more than two spaces - then automatically false
        if(one.length() + 2 > two.length() || two.length() + 2 > one.length()){
            return false;
        }

        if(one.length() > two.length() || two.length() > one.length()){
            checkIfInsertOrRemove(one, two);
        }else{

        }


        return false;
    }

    private static boolean checkIfInsertOrRemove(String one, String two) {
        int oneEditCounter = 0;

        //Returns shorter string
        String shorter = one.length() > two.length() ? two : one;

        //Returns longer string
        String longer = one.length() > two.length() ? one : two;

        for(int i = 0, j = 0 ; i < shorter.length(); i++, j++){
            //If you encouner a character that doesn't equal, increase the editCounter
            if(shorter.charAt(i) != longer.charAt(j)){
                oneEditCounter++;
                i--;

                if(oneEditCounter > 1){
                    return false;
                }
            }
        }

        return true;
    }


}

