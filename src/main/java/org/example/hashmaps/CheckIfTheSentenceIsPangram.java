package org.example.hashmaps;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {

        Set<Character> check = new HashSet<>();

        for(int i = 0 ; i < sentence.length(); i++){
            char curr = sentence.charAt(i);
            if(Character.isLetter(curr)){
                check.add(sentence.charAt(i));
            }
        }


        return check.size() >= 26;
    }
}
