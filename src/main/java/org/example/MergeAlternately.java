package org.example;


//Problem Statement - See AmpleNote

//Explanation:
//Loop through both strings until both reach the end
//Append a character to the new string alternately
//If you reach the end of one string, we still keep iterating and appending the left over characters
//on the separate string
public class MergeAlternately {

    public String merge(String one, String two){

         String newString = new String();
        for (int i = 0; i < one.length() || i < two.length(); i++){

            if(i < one.length()){

                newString += one.charAt(i);
            }

            if(i < two.length()){
                newString += two.charAt(i);
            }
        }
        return newString;
    }
}
