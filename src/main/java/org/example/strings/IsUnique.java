package org.example.strings;

/*
* Implement an algorithm to determine if a string has all unique characters
*
* How to do without additional data structures?
* */

import java.util.HashSet;
import java.util.Set;

//"AbC" = Unique
//"BDE" = Unique
public class IsUnique {
    //Clarifying Questions:
    //Do non-alphabetical characters count? Or you only giving me letters?
    // Yes assume no spaces in your string all letters, it's case sensitive, not case sensitive
    // Aabc == unique - case sensitive
    // Aabc == not unique - not case sensitive
    public static boolean algoOne(String string){
        Set<Character> characterSet = new HashSet<>();

        //Set's don't add duplicate values
        for(Character c: string.toUpperCase().toCharArray()){

            //Set will remain distinct after adding all values
            characterSet.add(c);
        }

        //If the sizes don't match, it'll return false, if the sizes match the string is unique
        return characterSet.size() == string.length();

        //Runtime O(n), Spacetime O(1)
    }


    //Using the ASCII character set
    public static boolean algoTwo(String string){

        if(string.length() > 128){
            return false;
        }

        boolean[] duplicateCharacterTracker = new boolean[128];

        for(int i = 0; i < string.length(); i++){

            if(duplicateCharacterTracker[string.charAt(i)]){
                return false;
            }

            duplicateCharacterTracker[string.charAt(i)] = true;
        }

        return true;
    }

}
