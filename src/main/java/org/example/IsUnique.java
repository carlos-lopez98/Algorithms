package org.example;

/*
* Implement an algorithm to determine if a string has all unique characters
*
* How to do without additional data structures?
* */

//"AbC" = Unique
//"BDE" = Unique
public class IsUnique {
    //Clarifying Questions:
    //Do non-alphabetical characters count? Or you only giving me letters?
    // Yes assume no spaces in your string all letters, it's case sensitive, not case sensitive
    // Aabc == unique
    // Aabc == not unique
    public static boolean algoOne(String string){

        return true;
    }


    public static boolean algoTwo(String string){

        return false;
    }

    public static boolean algoThree(String string){

        return false;
    }
}
