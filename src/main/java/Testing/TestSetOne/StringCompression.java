package Testing.TestSetOne;

/**
 * Implement a method to perform basic string compression using the counts of repeated characters. For example, the
 * string aabcccccaaa would become a2b1c5a3. If the "compmressed" string would not become smaller than the original
 * string, your method should return the original string You can assume the string has only uppercase and lowercase
 * letters. (a-z)
 */
public class StringCompression {


}
/**
 * This one can be done using a simple string concatenation, but in order to improve efficiency it's better
 * To use StringBuilder for the concatenation
 * <p>
 * We're going to initialize a new StringBuilder
 * We'll need a counter
 * And a variable to store previous character
 * <p>
 * We're going to loop through the string, every time we run into a duplicate character, we'll increment a count
 * When we run into a different character, we're going to add our previous character + the count to our new string
 * Then set our prev character = to our current character, and reset count back to 0, with this implementation, the last
 * character in our string won't be concatenated, as we won't run into a different character.
 * <p>
 * To concatenate this character, we must do one final concatenation out of the for loop
 */