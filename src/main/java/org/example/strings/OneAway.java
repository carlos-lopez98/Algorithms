package org.example.strings;

/*
*
* There are three types of edits that can be performed on strings: insert a character,
* remove a character, or replace a character. Given two strings, write a function to check if
* they are one edit (or zero edits away)
*
* */

//--Think in functions, try to make segments of your code into private functions
public class OneAway {


    public static boolean isOneAway(String one, String two){

        // Since we're looking just for one edit away, if either of the strings is greater than
        // two, we'll automatically know we're two edits away and return false
        if (one.length() >= two.length() + 2 || one.length() <= two.length() - 2
                || two.length() >= one.length() + 2 || two.length() <= one.length() - 2) {
            return false;
        }

        if(one.length() == two.length()){
            return checkReplacement(one, two);
        } else if(one.length() > two.length()){
            return checkInsertionAndRemoval(two, one);
        }else {
            return checkInsertionAndRemoval(one, two);
        }
    }

    public static boolean checkReplacement(String one, String two){
        int oneAway = 0;

        for(int i = 0, j = 0; i < one.length(); i++, j++){
            if(one.charAt(i) != two.charAt(j)){
                oneAway++;
            }
        }
        return !(oneAway > 1);
    }

    //Will take the shorter string as the first parameter
    //Takes the second string as the longer parameter
    public static boolean checkInsertionAndRemoval(String s, String l){
        //Will be used to track how many edits away the short string is from the long string
        //If more than one edit away, will return false
        int oneEdit = 0;

        for(int i = 0, j = 0; i < s.length(); i++, j++){
            if(s.charAt(i) != l.charAt(j)){
             //Shorter one needs to stay at the same position
             i--;
             oneEdit++;
            }
        }
        return !(oneEdit > 1);
    }
}

