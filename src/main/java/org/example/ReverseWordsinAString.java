package org.example;


/*
*
* Given a sentence, reverse the order of its words without affecting the order of letters within a given word.
*
*
* Sentence contains English uppercase and lowercase letters, digits, and spaces.
* 1≤sentence.length ≤10^4
* The order of the letters within a word is not to be reversed.
*
*
* Note: The input string may contain leading or trailing spaces or multiple spaces between words. The returned string,
* however, should only have a single space separating each word. Do not include any extra spaces.
* */
public class ReverseWordsinAString {

    //What I'm going to do, is have two pointers, one will stay at the beginning of the word
    //While the other traverses till the end, save those indexes, than create a substring
    //Then add that substring to the end of my new string to return

    public String reverseWords(String s){
        String result = "";
        int size = s.length();
        int i = 0 ;
        int j = i+1;

        //One thing I forgot was the leading/ trailing white spaces
        //If not trimmed, then you'll end up not even going through the loop in the first place
        s = s.trim(); //This trims in O(N) time


        //Will iterate through whole list, but stop at spaces
        //Keeps iterating, it'll break when I hits a space/ is greater than size
        while (i < size && s.charAt(i) != ' '){

            while(j < size && s.charAt(j) != ' '){
                //If j reaches a space, add the work backwards
                //If not just keep iterating
                j++;
            }

            //Once J = space, we'll substring up to that space
            //Notice how we did the concatenation - new word + result - effectively making the sentence backwards
            result = s.substring(i, j) + " " + result;

            //since J hit a space, we must iterate until it hits a letter
            while(s.charAt(j) == ' ' && j < size){
                j++;
            }

            //once it hits a letter, our i moves to that spot
            //and our j moves one forward -- then loop repeats
            i = j;
            j = i+1;
        }

        return result;
    }
}
