package org.example;

import org.example.strings.IsUnique;
import org.example.strings.OneAway;
import org.example.strings.PalindromePermutation;
import org.example.strings.StringCompression;

public class Main {
    public static void main(String[] args) {

        String s = "Hello we are    ";
        System.out.println(IsUnique.algoTwo("Carlos"));
        System.out.println(IsUnique.algoTwo("AA"));

        System.out.println(IsUnique.algoTwo("   "));
        System.out.println(IsUnique.algoTwo("a b c"));
    }
}