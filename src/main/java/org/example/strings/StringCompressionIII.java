package org.example.strings;

public class StringCompressionIII {

    public String compressedString(String word){
        StringBuilder comp = new StringBuilder();
        
        for(int i = 0; i < word.length(); i++){
            int count = 0;
            char curr = word.charAt(i);

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
