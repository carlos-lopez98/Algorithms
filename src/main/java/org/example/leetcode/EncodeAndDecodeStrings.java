package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Design an algorithm to encode a list of strings to a single string.
 * The encoded string is then decoded back to the original list of strings.
 * <p>
 * Please implement encode and decode
 * <p>
 * Example 1:
 * Input: ["neet","code","love","you"]
 * Output:["neet","code","love","you"]
 * <p>
 * <p>
 * Example 2:
 * Input: ["we","say",":","yes"]
 * Output: ["we","say",":","yes"]
 * <p>
 * <p>
 * Constraints:
 * 0 <= strs.length < 200
 * 0 <= strs[i].length < 200
 * strs[i] contains only 256 ASCII Characters
 */

public class EncodeAndDecodeStrings {


    //Encodes our list of strings - to a string
    public static String encodeString(List<String> strings) {
        //Create Delimiter
        char delimiter = '@';
        //Use stringbuilder for manipulation
        StringBuilder builder = new StringBuilder();
        //You need to make sure you start with length first - that way, your first word starts with the length
        //You can ignore any numbers after the delimiter check
        for (String str : strings) {
            builder.append(str.length());
            builder.append(delimiter);
            builder.append(str);
        }
        //Returns encoded string
        return builder.toString();
    }

    //Will decode a long string back into a list of strings
    public static List<String> decodeString(String encodedString) {

        //Create Delimiter
        char delimiter = '@';

        //Return array
        char[] string = encodedString.toCharArray();

        List<String> returnList = new ArrayList<>();


        for (int i = 0; i < encodedString.length(); i++) {
            //String builder to know how long our string will be
            StringBuilder stringLength = new StringBuilder();

            //Gives us the length of the string to iterate over
            //This stops at the delimiter
            while (string[i] != delimiter) {
                stringLength.append(string[i]);
                i++;
            }

            //So we increase i to be at our first letter
            i++;

            //Parsing our length from builder to an int
            //Creating a builder for the return string
            StringBuilder currentString = new StringBuilder();
            int length = Integer.parseInt(stringLength.toString());

            //We need a new variable j so we don't go past our length
            for (int j = 0; j < length; j++) {
                currentString.append(string[i]);
                i++;
            }
            //I will stop at the first number - we back track once, becuase
            //If we leave it there, the loop will then move it to the second possible number or delimiter
            i--;

            //Then we add the current string to the list
            returnList.add(currentString.toString());
        }

        //In the end we return a list of strings
        return returnList;
    }
}
