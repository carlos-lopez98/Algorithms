package org.example;

/*
* Implement an algorithm to determine if a string has all unique characters
*
* How to do without additional data structures?
* */

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    //This one works but uses a data structure
    public static boolean algoOne(String string){
       Set<Character> charSet = new HashSet<>();

       for(char c: string.toCharArray()){
           charSet.add(c);
       }

       if(charSet.size() == string.length()){
           return true;
       }else {
           return false;
       }
    }

    //This one works but doesn't check for things like spaces etc...
    public static boolean algoTwo(String string){

        String lowerCase = string.toLowerCase();

        for(int i = 0; i < lowerCase.length(); i++){
            char first = lowerCase.charAt(i);
            for(int j = i + 1; j < lowerCase.length(); j++){
                char second = lowerCase.charAt(j);
                if(first == second){
                    return false;
                }
            }
        }
        return true;
    }


    //Another possible solution is to use the ASCII code of the string -- **NEED TO IMPLEMENT**
    //Assume working with the standard ASCII table of 128 values

    public static boolean algoThree(String string){
        //Remember to check for edge cases
        if(string.length() > 128) {
            return false;
        }

        boolean[] booleanValues = new boolean[128];

        for(char c: string.toCharArray()){

            //When you set an int = char, the int will become the ASCII value of the char
            int temp = c;

            if(booleanValues[temp]){
                return false;
            }

            booleanValues[temp] = true;
        }

        return true;
    }
}
