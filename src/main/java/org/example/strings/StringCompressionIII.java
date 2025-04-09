package org.example.strings;

public class StringCompressionIII {

    public String compressedString(String word){
        StringBuilder comp = new StringBuilder();

        //If we use an outer while loop - we can more easily manipulate our ith position
        //By that I mean you don't have to take into account where I ends in the inner while loop
        for(int i = 0; i < word.length(); i++){
            int count = 0;
            char curr = word.charAt(i);

            //When we reach a character that doesn't match our
            while(i < word.length() && curr == word.charAt(i) && count < 9){
                i++;
                count++;
            }

            comp.append(count);
            comp.append(curr);
            i--;
        }

        return comp.toString();
    }
}
