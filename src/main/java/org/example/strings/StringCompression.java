package org.example.strings;

/**
*Implement a method to perform basic string compression using the counts of repeated characters.
* IE, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become
* smaller than the original string, your method should return the original string. You can assume
* the string has only uppercase and lowercase letters (a-z)
*/

public class StringCompression {
    //Questions:
    //Is this case sensitive? will a be equal to A

    public static String stringCompress(String s) {

        StringBuilder newString = new StringBuilder();
        int counter = 1;
        char previous = s.charAt(0);

        for(int i = 1; i < s.length(); i++){

            char current = s.charAt(i);
            if(current == previous){
                counter++;
            }else{
                newString.append(Character.toString(previous) + counter);
                counter = 1;
                previous = current;
            }
        }

        newString.append(Character.toString(previous) + counter);

        return newString.length() > s.length() ? s : newString.toString();
    }
}












