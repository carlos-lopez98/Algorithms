package org.example.linkedlist;

import org.example.practice.Node;

public class Palindrome {

    public static boolean isLinkedListPalindrome(Node head){

       Node reverse = reverseLinkedList(head);

       while(reverse != null){
           if(reverse.data != head.data){
               return false;
           }
           reverse = reverse.next;
           head = head.next;
       }


        return true;
    }

    //Here's where we have to imagine putting in elements at the head
    //Effectively reversing our list
    public static Node reverseLinkedList(Node head){
        if(head == null){
            return null;
        }

        Node tempHead = head;

        Node newHead = null;

        // 1, 2, 3, 4

        // 1 -> null
        // 2 -> 1 -> null
        // 3 -> 2 -> 1 -> null
        // 4 -> 3 -> 2 -> 1 -> null

        while(tempHead != null){
            Node n = new Node(tempHead.data);
            n.next = newHead;
            newHead = n;

            tempHead = tempHead.next;
        }

        return newHead;
    }
}

/**
 * Using our trick to reverse a linkedList
 * We're able to reverse the list, then just compare our newlist
 * To the original list to make sure our list is a Palindrome
 */
