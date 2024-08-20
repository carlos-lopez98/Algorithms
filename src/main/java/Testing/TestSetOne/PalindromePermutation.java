package Testing.TestSetOne;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase
 * that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need
 * to be limited to just dictionary words. You can ignore casing and non-letter characters.
 */
public class PalindromePermutation {

    public static boolean isPalindrome(String s){
        //Character counter initialized to 26 as there are only 26 letters in the alphabet
        int[] charCounter = new int[26];
        int nonAlphaCharacter = 0;
        for(int i = 0; i < s.length(); i++){
            //returns a value 1-26 for every character in the string
            int tempCharValue = getNumericalValue(s.charAt(i));

            if(tempCharValue != -1){
                //Inputs the count at every position in the count array
                charCounter[tempCharValue]++;
            }else{
                nonAlphaCharacter++;
            }

            if(nonAlphaCharacter == s.length()){
                return false;
            }
        }

        //Checking for odd and even, not character count
        int oddCounter = 0;

        for(int j = 0; j < charCounter.length; j++){

            if(charCounter[j] % 2 == 1){
              oddCounter++;
            }
        }

        //Returns false if the oddcounter is greater than 1, which is what we want, if more than one odd, then we don't
        //Have a palindrome permutation
        return !(oddCounter > 1);
    }

    public static int getNumericalValue(char input){

        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        int A = Character.getNumericValue('A');
        int Z = Character.getNumericValue('Z');

        int in = Character.getNumericValue(input);

        //This should return a range of 0-26
        if(in <= z && in >= a){
            return in - a;
        } else if( in <= Z && in >= A){
            return in - A;
        }else{
            return -1;
        }
    }
}
/**
 * What is a palindrome exactly?
 *
 * racecar
 *
 * each letter has a pair
 *
 * aabb
 *
 * each letter has a pair
 *
 * aacbb
 *
 * one letter doesn't have a pair
 *
 * so a palindrome would be a phrase/ combination of characters where each letter has exactly one pair, there can only
 * be one letter/ character without a matching pair, if there are more than one, then you're automatically can't be a
 * palindrome.
 *
 * Letters that pair up are even, characters that have one non-pair would be odd
 * So basically we're just going to check if characters are odd or even, if the string has more than one odd element
 * it's automatically not a permutation of a palindrome
 *
 * To remove casing/ non letters characters, we can create a function that creates a range for alphabetical letters only
 */