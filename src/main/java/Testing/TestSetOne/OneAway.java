package Testing.TestSetOne;

/**
 * There are three types of edits that can be performed on a string. Insert a character, remove a character, or
 * replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
 */
public class OneAway {

    //If the strings differentiate by more than two in length, then automaticall return false, as they're going to be
    //More than two edits away

    public static boolean oneAway(String one, String two) {

        if (one.length() > two.length() + 1 || two.length() > one.length() + 1) {
            return false;
        }

        //If they are equal in lengths, we just need to see if there are more than one characters that don't match
        if (one.length() == two.length()) {


        }


    }

    public static boolean equalLengthCompare(String one, String two) {

        int counter = 0;
        for (int j = 0, i = 0; i < one.length(); j++, i++) {
            if (one.charAt(i) != two.charAt(j)) {
                counter++;
            }
        }

        //If more than two different characters, we'll return false
        return !(counter > 1);
    }

}
