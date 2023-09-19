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
            //First node's next will become null
            n.next = head;
            //Then head is moved to the next node
            head = n;
            //Finally we move the node on original list for the next iteration
            node = node.next;
        }
        return head;
    }
}
