package org.example;

import org.example.arrays.*;
import org.example.helper.Pair;
import org.example.linkedlist.RemoveDups;
import org.example.linkedlist.ReturnKthToLast;
import org.example.practice.Node;
import org.example.practice.Recursion;
import org.example.strings.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15}
        };


        Node head = new Node(1);
        Node one = new Node(2);
        Node two = new Node(3);
        Node three = new Node(4);
        Node four = new Node(5);

        head.next = one;
        one.next = two;
        two.next = three;
        three.next = four;
//        System.out.println(ReturnKthToLast.returnKthToLast(head, 1));
//        RemoveDups.algoOne(head);
//
//        Node current = head;
//
//        while(current != null){
//            System.out.println(current.data);
//            current = current.next;
//        }

        int[] nums = {2, 5, 3, 4, 1};

        BubbleSort.sortDescendingRightToLeft(nums);
        System.out.println(Arrays.toString(nums));
    }
}