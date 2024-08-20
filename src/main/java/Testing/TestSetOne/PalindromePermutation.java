package Testing.TestSetOne;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase
 * that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need
 * to be limited to just dictionary words. You can ignore casing and non-letter characters.
 */
public class PalindromePermutation {



    public int getNumericalValue(char input){

        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        int A = Character.getNumericValue('A');
        int Z = Character.getNumericValue('Z');

        //This should return a range of 0-26
        if(input <= z && input >= a){
            return input - a;
        } else if( input <= Z && input >= A){
            return input -A;
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