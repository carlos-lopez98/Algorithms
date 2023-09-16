package org.example;

import org.example.practice.Node;

import java.util.HashSet;
import java.util.Set;

/*
 * Write code to remove duplicates from an unsorted linked list
 *
 * How would you solve this problem if a temporary buffer is not allowed?
 * */
public class RemoveDups {
    //Question: You may need to know the data you'll be tracking in each node
    public Node algoOne(Node head) {
        Node current = head;
        Node previous = null;
        Set<Integer> dupTracker = new HashSet<>();

        dupTracker.add(head.data);

        while (current.next != null) {

            //Removes the link for the duplicate element
            if (dupTracker.contains(current.data)) {
                previous.next = current.next;
            } else {
                //Previous only changes if data is being added to the duplicateTracker
                dupTracker.add(current.data);
                previous = current;
            }

            current = current.next;
        }
        return head;
    }
}
