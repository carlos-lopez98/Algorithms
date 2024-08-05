package org.example.linkedlist;

import org.example.practice.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * Write code to remove duplicates from an unsorted linked list
 * <p>
 * How would you solve this problem if a temporary buffer is not allowed?
 */

public class RemoveDups {

    //Easy way I think of doing this is to create let's say a HashMap, with the key as the current nodes value
    //And the value being the count, if we encounter data that's already in the HashMap, then we remove that duplicate
    //From the linkedList
    public static Node algoOne(Node head) {

        if (head == null) {
            return null;
        }

        Set<Integer> dupTracker = new HashSet<>();

        Node previous = head;
        Node current = head.next;

        //Add the first position in the linkedList
        dupTracker.add(previous.data);

        while (current != null) {

            if (dupTracker.contains(current.data)) {

                previous.next = current.next;
                current = current.next;
            } else {
                dupTracker.add(current.data);
                previous = current;
                current = current.next;
            }
        }

        return head;
    }
}