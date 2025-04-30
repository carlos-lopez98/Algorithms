package org.example.leetcode;


import java.util.HashSet;
import java.util.Set;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */
public class ValidAnagram {


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        //This one is a little tricky way of solving
        //With the frist iteration you add to the frequency counts
        int[] array = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            array[getNumericalValue(current)] = Integer.sum(array[getNumericalValue(current)], 1);
        }

        //In the second iteration you subtract, if a count is ever less than 0 then we know automatically
        //We have an invalid string
        for (int j = 0; j < t.length(); j++) {
            char current = t.charAt(j);
            array[getNumericalValue(current)] = Integer.sum(array[getNumericalValue(current)], -1);

            if (array[getNumericalValue(current)] < 0) {
                return false;
            }
        }

        return true;
    }

    public static int getNumericalValue(char c) {

        int A = Character.getNumericValue('A');
        int Z = Character.getNumericValue('Z');
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        int curr = Character.getNumericValue(c);

        if (curr <= Z && curr >= A) {
            return curr - A;
        } else if (curr <= z && curr >= a) {
            return curr - a;
        }

        return -1;
    }
}
