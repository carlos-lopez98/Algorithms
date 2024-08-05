package org.example;

import org.example.arrays.*;
import org.example.helper.Pair;
import org.example.linkedlist.RemoveDups;
import org.example.practice.Node;
import org.example.practice.Recursion;
import org.example.strings.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8,9,10,11},
                {12,13,14,15}
        };


//        Node head = new Node(1);
//        Node one = new Node(1);
//        Node two = new Node(2);
//        Node three = new Node(3);
//        Node four = new Node(3);
//
//        head.next = one;
//        one.next = two;
//        two.next = three;
//        three.next = four;
//
//        RemoveDups.algoOne(head);
//
//        Node current = head;
//
//        while(current != null){
//            System.out.println(current.data);
//            current = current.next;
//        }

        int[] nums = {1,2,3,4,5};
        BubbleSort.sortDescendingLeftToRight(nums);
        System.out.println(Arrays.toString(nums));
    }
}