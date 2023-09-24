package org.example;

/*
*Implement a method to perform basic string compression using the counts of repeated characters.
* IE, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become
* smaller than the original string, your method should return the original string. You can assume
* the string has only uppercase and lowercase letters (a-z)
*/
public class StringCompression {
    //Questions - Do lower/ uppercase sequencing count as one letter or two?
    //What do I return if both strings end up being the same length?

    public static String algoOne(String s){

        char[] string = s.toCharArray();
        String manipulated = new String();
        int charCounter = 0;
        char previous = '0';

        for(int i = 0; i < string.length; i++){
            char current = string[i];

            if(i == 0){
                previous = current;
                charCounter++;
            }else if(current != previous){
                //Concat doesn't automatically update your string, you need to set it = to a new/ old string
                manipulated = manipulated.concat(previous + String.valueOf(charCounter));

                if(i == string.length - 1){
                    manipulated = manipulated.concat(String.valueOf(current) + charCounter);
                }

                previous = current;
                charCounter = 1;
            }else{
                previous = current;

                if(i == string.length - 1){
                    manipulated = manipulated.concat(String.valueOf(current) + charCounter);
                }

                charCounter++;
            }
        }


        if(manipulated.length() >= s.length()){
            return s;
        }

        return manipulated;
    }
}













//    public static String algoOne(String compression){
//
//        int countCharacter = 1;
//        char previous = '0';
//        char current = '0';
//        String compressed = new String();
//
//        //Looping through string to set starting parameters
//        for(int i = 0; i < compression.length(); i++){
//
//            //At position 0, start compressed string with first value
//            if(i == 0){
//                previous = compression.charAt(i);
//                current = compression.charAt(i);
//                compressed = compressed.concat(String.valueOf(current));
//            }
//
//            //At next positions
//            else{
//                current = compression.charAt(i);
//
//                //Check if current == previous and increase count
//                if(current == previous){
//                    countCharacter++;
//
//                    //If at last position, loop will end, and string will be appended with the count of last character
//                    if(i == compression.length() - 1){
//                        compressed = compressed.concat(String.valueOf(countCharacter));
//                    }
//                }
//                //Algorithm performed in middle of string - Adds previous characters count + next character
//                //Then resets the values
//                else {
//                    compressed = compressed.concat(String.valueOf(countCharacter) + String.valueOf(current));
//                    previous = current;
//                    countCharacter = 1;
//                }
//            }
//        }
//
//        //Checks to see which string is larger and returns the shorter string/ if equals it return original string
//        if(compression.length() > compressed.length()){
//            return compressed;
//        }else{
//            return compression;
//        }
//    }