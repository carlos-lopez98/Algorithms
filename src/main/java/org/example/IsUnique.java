package org.example;

/*
* Implement an algorithm to determine if a string has all unique characters
*
* How to do without additional data structures?
* */

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

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
}
