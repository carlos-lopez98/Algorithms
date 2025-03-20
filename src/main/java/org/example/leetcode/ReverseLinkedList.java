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

        Node previous = null;
        Node current = head;
        Node next;

        while(current != null){
            next = current.next; //saves our next spot
            current.next = previous; //now our .next pointer points to the prev elements - in the first iteration it's null
            previous = current; //now our previous is our current
            //lastly we move our current up
            current = next;
        }

        return previous;
    }
}
