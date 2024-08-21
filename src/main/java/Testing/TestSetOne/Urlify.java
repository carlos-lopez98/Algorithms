package Testing.TestSetOne;

/**
 * Write a method to replace all spaces in a string with "%20" you may ssume that the string has sufficient space
 * at the end to hold the additional characters, and that you are given the "true" length of the string. (Note. If
 * implementing in Java, please use a character array so that you can perform this operation in place.
 */
public class Urlify {



    public static char[] url(char[] s){



    }
}
/**
 * This one you have to think about differently, we're given a string with extra white space at the end
 * Our true string, so up to the last non-white space character, will have white spaces in between, so
 * think of a phrase "The brown fox jumped over the great blue fence" we're replacing the spaces with
 * %20, the reason we're being given extra white spaces is because they want us to perform swaps, the problem gives it
 * away, but the caveat, is that they're saying they're giving enough white space. That means that the string
 * may have extra white spaces we don't need.
 *
 * With this in mind we can start, in order to do this in place, we want to swap values from the back of the string
 * to a pointer starting in the white spaces. To figure out the start positions we have to think for a second.
 *
 * We're being give our true length, so that will be the start position for the string pointer, the white space pointer
 * will be determined by the amount of whitespaces we need in order to perform the swaps.
 */
