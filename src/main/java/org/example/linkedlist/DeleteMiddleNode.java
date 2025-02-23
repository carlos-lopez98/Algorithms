package org.example.linkedlist;

import org.example.practice.Node;

/**
 * You are only given access to a middle node in the linkedlist
 * Implement an alogrithm to delete that node from the linked list
 * The node will not necessarily be the exact middle
 * <p>
 * Input: a -> b -> c -> d -> e -> f
 * <p>
 * Delete node b, only being given node b
 * <p>
 * New LinkedList: a -> c -> d -> e -> f
 */
public class DeleteMiddleNode {

    public static void deleteNode(Node node) {
        if (node == null) {
            return;
        }

        Node nextNode = node.next;
        //We move the data over
        node.data = nextNode.data;
        //Then we move the pointer over
        node.next = node.next.next;
    }
}

/**
 * When doing this opertion, we must remember that Java works as pass by value only, so when a node is passed in,
 * We're effectively getting a copy pointer that points to the original object in memory. If we were to just perform the
 * Below.
 * <p>
 * node = node.next
 * <p>
 * We're just changing this copy pointer, we're not changing the original linked list, but since our node we got
 * Points to the same object in memory, we just need to change our object in memory.
 * <p>
 * This only works by implementing the above code
 */
