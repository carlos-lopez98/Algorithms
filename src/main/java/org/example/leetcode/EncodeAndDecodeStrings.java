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


    //You need to encode the string with a delimiter
    //And string length
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        char delimiter = '@';

        for(String current: strs){
            sb.append(current.length());
            sb.append(delimiter);
            sb.append(current);
        }

        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {

        char delimiter = '@';
        List<String> returnList = new ArrayList<String>();

        //Iterate through original string
        for(int i =0; i < s.length(); i++) {
            StringBuilder stringLength = new StringBuilder();

            //Get your string length when you hit a delimiter
            while(s.charAt(i) != delimiter){
                stringLength.append(s.charAt(i));
                i++;
            }

            i++;

            //Then convert your string integer into an int
            int length = Integer.parseInt(stringLength.toString());
            StringBuilder current = new StringBuilder();

            //The length is how far into your going to iterate into, to pull your string
        for(int j = i; j <i + length; j++){
            current.append(s.charAt(j));
            i++;
        }

        i--;

        returnList.add(current.toString());
    }

        return returnList;
    }
}
