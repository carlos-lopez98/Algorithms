package org.example.leetcode;

import org.example.practice.Node;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Constraints:
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 */
public class ReverseLinkedList {


    public static Node reverseList(Node head){

        //Set previous to point to null
        Node previous = null;

        //Set a current to point to our current head
        Node current = head;

        //Declare a next node
        Node next;

        while(current != null){
            //Let's say our linked list was 1, 2, 3, 4
            //Next is immediately 2
            next = current.next;
            //Head points to null
            current.next = previous;
            //Move previous from our null to one
            previous = current;

            //current moves to two
            current = next;
        }

        return previous;
    }
}
