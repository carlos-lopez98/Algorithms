package org.example.linkedlist;

import org.example.practice.Node;

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * <p>
 * There is a cycle in a linkedlist if there is some node in the list that can be reached again by continuously
 * Following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is
 * Connected to. Note that pos is not passed as a parameter.
 * <p>
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class HasCycle {


    public static boolean hasCylce(Node head) {

        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            if (fast == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;

        }
        return false;
    }
}

/**
 * This one is pretty easy to think about
 *
 * You're given one list with or without a cycle in it
 *
 * Easy solution is the two pointer method, one pointer will move faster than the other pointer
 * If there is a cycle in the linkedList eventually your two pointers will overlap and be equal to each other
 * Return true if this happens, if no cycle is in the list, then you'd just hit null at the end of the list and return
 * False
 */
