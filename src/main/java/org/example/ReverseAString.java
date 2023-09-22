package org.example;

/*
* Given a string S, return the reverse of the string
* */
public class ReverseAString {
    //You can do this by turning array to string then just rearranging the elements one by one

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

}
