package org.example.linkedlist;

import org.example.practice.Node;

/**
 * Implement an algorithm to find the kth to last element of a singly linked list
 */
public class ReturnKthToLast {

    //Starting at one, ensures the last element in the linkedList is accounted for
    //Once we reach it
    public static int backTrackCounter = 1;
    public static int data = -1;

    //Given the head element and the kthToLastPosition
    public static void backTrack(Node head, int kthPosition) {

        System.out.println(backTrackCounter);

        if (head == null) {
            return;
        }

        backTrack(head.next, kthPosition);

        if (backTrackCounter == kthPosition) {
            data = head.data;
        }

        backTrackCounter++;
    }


    public static int returnKthToLast(Node head, int kthPosition){
        backTrack(head, kthPosition);
        return data;
    }
}
