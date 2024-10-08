package Testing.TestSetOne;

/**
 * Write a method to replace all spaces in a string with "%20" you may ssume that the string has sufficient space
 * at the end to hold the additional characters, and that you are given the "true" length of the string. (Note. If
 * implementing in Java, please use a character array so that you can perform this operation in place.
 */
public class Urlify {

    public static char[] url(char[] s, int trueLength) {

        int firstpointer = trueLength - 1;
        int whitespace = 0;

        for(int i =0; i < trueLength; i++){
            if(s[i] == ' '){
               whitespace++;
            }
        }

        int secondPointer = (trueLength - 1) + (whitespace * 2);

        for(; firstpointer > 0; firstpointer--){
            if(s[firstpointer] != ' '){
                s[secondPointer] = s[firstpointer];
                secondPointer--;
            }else{
                s[secondPointer] = '0';
                s[secondPointer - 1] = '2';
                s[secondPointer - 2] = '%';
                secondPointer -=3;
            }
        }

        return s;
    }
}
/**
 * This one you have to think about differently, we're given a string with extra white space at the end
 * Our true string, so up to the last non-white space character, will have white spaces in between, so
 * think of a phrase "The brown fox jumped over the great blue fence" we're replacing the spaces with
 * %20, the reason we're being given extra white spaces is because they want us to perform swaps, the problem gives it
 * away, but the caveat, is that they're saying they're giving enough white space. That means that the string
 * may have extra white spaces we don't need.
 * <p>
 * With this in mind we can start, in order to do this in place, we want to swap values from the back of the string
 * to a pointer starting in the white spaces. To figure out the start positions we have to think for a second.
 * <p>
 * We're being give our true length, so that will be the start position for the string pointer, the white space pointer
 * will be determined by the amount of whitespaces we need in order to perform the swaps.
 * If our phrase has 8 white spaces in between, how many white spaces at the end will we need, we need two extra spaces
 * for every space, so we'll need 16 extra spaces. So our start pointer position in the white space will be true length
 * plus the white space * 2
 * <p>
 * Then we'll just perform swaps at every non-white space, and if we reach a white space we insert, %20, then move our
 * pointer down by three instead of one.
 */
