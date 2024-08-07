package org.example.linkedlist;

import org.example.practice.Node;

/**
 * You are only given access to a middle node in the linkedlist
 * Implement an alogrithm to delete that node from the linked list
 * The node will not necessarily be the exact middle
 *
 * Input: a -> b -> c -> d -> e -> f
 *
 * Delete node b, only being given node b
 *
 * New LinkedList: a -> c -> d -> e -> f
 */
public class DeleteMiddleNode {


    public static void deleteNode(Node node){
        if (node == null){
            return;
        }

        node.data = node.next.data;
        node.next = node.next.next;
    }
}
