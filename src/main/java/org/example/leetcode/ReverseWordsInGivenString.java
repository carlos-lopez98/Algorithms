package org.example.leetcode;

/*
*
* Given a String S, reverse the string without reversing its individual words. Words are separated by dots
*
* INPUT:
* S = i.like.this.program.very.much
* OUTPUT:
* much.very.program.this.like.i
*
*/
public class ReverseWordsInGivenString {

    public static String reverseStringNotWords(String s){

        if(s.isBlank() || s.isEmpty() || s.length() == 1){
            return s;
        }

        //Split the string at the dots - it'll return a string array
        //The "." has a special meaning when splitting strings - it means split all characters - so this returns an empty array
        //Split is essentially generating multiple strings - this leads to O(N) space complexity
        String[] words = s.split("\\.");
        String reversed = new String();

        //For the iteration - this would be O(N) since this would take longer the longer your string is
        for(int i = words.length - 1; i > -1; i--){

            if (reversed.isBlank()){
                reversed += words[i];
            }else{
                reversed += "." + words[i];
            }
        }

        return reversed;
    }
}
