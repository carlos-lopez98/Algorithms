package org.example;

import org.example.practice.Node;

/*
*
* Implement a function to check if a linked list is a palindrome
*
*
* */
public class PalindromeLinkedList {
    //A palindrome will be the same forwards and backwards
    //If a palindrome is a palindrome, then that means we'd only have to check half of the list
    //As the other half would = the first half



    public Node reverse(Node node){
        Node head = null;

        while (node!= null){
            Node n = new Node(node.data);
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }
}
