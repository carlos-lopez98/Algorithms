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
       Set<Character> uniqueSet = new HashSet();

        for(char current: string.toCharArray()){
            uniqueSet.add(current);
        }

        if(uniqueSet.size() == string.length()){
            return true;
        }else{
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
}
