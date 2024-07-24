package org.example;

/*
* Implement an algorithm to determine if a string has all unique characters
*
* How to do without additional data structures?
* */

import java.util.HashSet;
import java.util.Set;


//Clarifying Questions:
//Would this just be for alphabetical characters? IE would two spaces return false
//What character set is the String using? IE ASCII, EXTENDED ASCII, Unicode
public class IsUnique {

    //Solution 1: use a set/ data structure
    public static boolean algoOne(String string){

        Set<Character> unique = new HashSet<>();

        for(int i = 0; i < string.length(); i++){
            unique.add(string.charAt(i));
        }

        if(unique.size() == string.length()){
            return true;
        }
        return false;
    }

    //This one assumes that spaces are counted, IE multiple spaces will return false
    //This one also happens to not use a data structure
    //Two pointer solution O(n^2)
    public static boolean algoTwo(String string){

        for (int i = 0; i < string.length()-1; i++){
            for(int j = i+1; j < string.length(); j++){
                if(string.charAt(j) == string.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }


    //Another possible solution is to use the ASCII code of the string -- **NEED TO IMPLEMENT**
    //Assume working with the standard ASCII table of 128 values
    public static boolean algoThree(String string){
        //Easy case, if the string is longer than 128 then it's automatically not unique
        if (string.length() > 128){
            return false;
        }

        //You could also do this with true or false values
        //Create an array that will hold true or false
        boolean[] valueIsPresent = new boolean[128];

        for(int i = 0; i < string.length(); i++){

            //This will check it's ASCII value as it's position
            if(valueIsPresent[string.charAt(i)]){
                return false;
            }
            valueIsPresent[string.charAt(i)] = true;
        }

       return true;
    }
}
