package org.example.strings;

/*
*Implement a method to perform basic string compression using the counts of repeated characters.
* IE, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become
* smaller than the original string, your method should return the original string. You can assume
* the string has only uppercase and lowercase letters (a-z)
*/
public class StringCompression {
    //Questions - Do lower/ uppercase sequencing count as one letter or two?
    //What do I return if both strings end up being the same length?

    public static String stringCompress(String s){

        //We're going to assume the string is case sensitive, Meaning A != a
        //We're also going to assume we are to return the original string if they end up being the same length

        //Count starts at one as everytime we iterate on to a new character it's one
        int count = 1;


        //Iterate through the string, everytime we hit a duplicate character count++
        //When we don't hit a duplicate we append the letter and then append the count
        //One thing to take note of is that doing s + "a" runs at O(n^2) because a new string
        //object needs to be created and all individual characters copied over

        StringBuilder compressed = new StringBuilder();
        char previous = s.charAt(0);

        //The for loop only accounts up to the second to last distinct letter
        //When you hit the last letter, the for loop just increases the count
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == previous){
             count++;
            }else{
                compressed.append(previous);
                compressed.append(count);
                previous = s.charAt(i);
                count = 1;
            }
        }

        //Adds the last letter plus it's count to the string
        compressed.append(previous);
        compressed.append(count);

        return compressed.length() > s.length() ? s: compressed.toString();
    }
}












