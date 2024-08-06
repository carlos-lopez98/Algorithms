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
    public static int returnKthElement(Node head, int kthPosition) {

        if (head == null) {
            return 0;
        }

        returnKthElement(head.next, kthPosition);
        backTrackCounter++;

        if (backTrackCounter == kthPosition) {
            data = head.data;
        }

        return data;
    }
}
