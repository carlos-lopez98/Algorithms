package org.example.leetcode;

/*
* Given a string S, return the reverse of the string
* */
public class ReverseAString {

    //Takes in a char array, just reverse it
    public static void reverse(char[] s){
        int i = 0;
        int j = s.length -1;

        while(i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }

    }

    //How would I use recursion to reverse a string
    public static String reversedRecursion(String string){
        if(string == null || string.length() <= 1){
            return string;
        }

        //This is going to reduce the strings size all the way to 1 character
        /*If you recurse like this, you'll effectively rebuild the string in the original order*/
        //String reversed = reversedRecursion(string.substring(0, string.length() - 1));


        //Here you iterate through the string removing the front character from the front, but adding it to the back
        //At the end, you'll have a string = "", which will get moved to the back, and complete your reversed string
        return reversedRecursion(string.substring(1)) + string.charAt(0);
    }
}
