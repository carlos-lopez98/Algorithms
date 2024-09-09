package org.example.leetcode;

/*
* Given a string S, return the reverse of the string
* */
public class ReverseAString {
    //You can do this by turning array to string then just rearranging the elements one by one
    //Time complexity(O(n)) space o(1) you need a single array to hold elements in place
    public static String reversed(String string){
        char[] reversed = string.toCharArray();

        int counter = 1;
        //Notice how we can have two pointers - one starts at the beginning one at the end
        //And they both end up meeting in the middle
        for(int i = 0, j = string.length() - 1; i < j; i++, j--){
            char temp = reversed[i];
            reversed[i] = reversed[j];
            reversed[j] = temp;
        }

        return String.valueOf(reversed);
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
