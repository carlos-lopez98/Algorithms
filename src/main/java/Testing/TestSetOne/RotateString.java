package Testing.TestSetOne;

/**
 * Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, s1, and
 * s2, write code too check if s2 is a rotation of s1 using only one call to isSubstring (e.g., "waterbottle" is a
 * rotation of "erbottlewat"
 */
public class RotateString {


    public static boolean isRotation(String one, String two){
        //Lengths must be equal in order for the second string to be a rotation of the first string
        if(one.length() != two.length()){
            return false;
        }


        for(int i = 0; i < one.length(); i++){

        }
    }

    public static boolean checkRotationAtPoint(String one, String two, int rotation){




    }
}

/**
 * This one is best done using the trick where you can start an iteration at different points in a string
 *
 * Trick is done by giving a function different starting positions and using % the string's length as the start point
 * Envision an outer loop that passes is values 0 - string length as the starting point, once starting point is taken
 * the second for loop will always start the first string comparison at position 0 while the second comparison starts
 * at start point % string length, when the second pointer reaches the end of the string, it's going to be reset to,
 * input start point % string length
 */