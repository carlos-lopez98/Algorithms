package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Design an algorithm to encode a list of strings to a single string.
 * The encoded string is then decoded back to the original list of strings.
 *
 * Please implement encode and decode
 *
 * Example 1:
 * Input: ["neet","code","love","you"]
 * Output:["neet","code","love","you"]
 *
 *
 * Example 2:
 * Input: ["we","say",":","yes"]
 * Output: ["we","say",":","yes"]
 *
 *
 * Constraints:
 * 0 <= strs.length < 200
 * 0 <= strs[i].length < 200
 * strs[i] contains only 256 ASCII Characters
 */

public class EncodeAndDecodeStrings {


    //Encodes our list of strings - to a string
    public static String encodeString(List<String> strings){

        char delimiter = '@';
        StringBuilder builder = new StringBuilder();

        //Having the length + the delimiter is what makes this work
        for (String str: strings){
            builder.append(str.length());
            builder.append(delimiter);
            builder.append(str);
        }

        //Returns encoded string
        return builder.toString();
    }

    //Will decode a long string back into a list of strings
    public static List<String> decodeString(String encodedString){

        char delimiter = '@';
        char[] string = encodedString.toCharArray();

        List<String> returnList = new ArrayList<>();

        for(int i = 0; i < encodedString.length(); i++){
            StringBuilder stringLength = new StringBuilder();

            //Gives us the length of the string to iterate over
            while(string[i] != delimiter){
                stringLength.append(string[i]);
                i++;
            }

            StringBuilder currentString = new StringBuilder();
            for(int j = i + 1; j < Integer.valueOf(stringLength.toString()); j++){
                currentString.append(string[j]);
            }

            returnList.add(currentString.toString());
        }

        return returnList;
    }
}
