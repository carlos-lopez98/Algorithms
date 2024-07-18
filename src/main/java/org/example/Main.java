package org.example;

import org.example.arrays.*;
import org.example.practice.*;
import org.example.practice.reference_type.Person;
import org.example.trees.Tree;
import org.example.trees.TreeNode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        BasicArrayOperations.changeElementAtIndex(nums,0,16);

        System.out.println(Arrays.toString(nums));
    }
}