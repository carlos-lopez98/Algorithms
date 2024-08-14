package org.example.linkedlist;

import org.example.practice.Node;

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linkedlist if there is some node in the list that can be reached again by continuously
 * Following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is
 * Connected to. Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class HasCycle {



    public static boolean hasCylce(Node head){

        if(head == null){
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){


        }




        return false;
    }



}
