package org.example.strings;

import java.util.Arrays;

public class StringOperations {

    /**
     * Reverse a string
      */

    //Since strings are immutable in Java, you have to use the array datastructure to reverse the string
    public static void reverseString(String s){

        char[] stringArray = s.toCharArray();
        for(int i = 0, j = s.length()-1; i < j; i++, j--){
            char temp = stringArray[j];
            stringArray[j] = stringArray[i];
            stringArray[i] = temp;
        }

        String newString = new String(stringArray);

        System.out.println(newString);
    }

    //Remember that you don't have to invent the wheel, java comes with the StringBuilder class, that has a built in reverse
    //Method. If you need the string to be immutable then you can always convert the string builder back to a string
    public static void revereStringUsingStringBuilder(String s){

        StringBuilder builder = new StringBuilder(s);
        builder.reverse();

        System.out.println(builder);
    }
}
