package org.example;

import org.example.arrays.*;
import org.example.practice.*;
import org.example.practice.reference_type.Person;
import org.example.trees.Tree;
import org.example.trees.TreeNode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] empty = {};

        int[] nums = {1,2,3,4,5};

        System.out.println(BasicArrayOperations.isSorted(nums));
    }
}