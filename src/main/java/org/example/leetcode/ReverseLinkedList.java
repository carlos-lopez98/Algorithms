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

            //Save the next one, cause we're going to adjust the .next pointer
            next = current.next;

            //Set .next to our previous  - which starts with null
            current.next = previous;


            //Then our previous becomes our current
            previous = current;

            //Then our current moves to the original next
            current = next;
        }

        return previous;
    }
}
