package org.example.practice;

public class ReverseLinkedList {


    public static Node reverseList(Node node){
        Node head = null;

        //While the node is not null
        //Create a new node
        //set that new node's value = to the current data
        //then it's next value equal to our current head
        //then  move the head pointer up to the new node

        //You effectively add elements in reverse
        while(node != null){
            Node n = new Node(node.data);
            n.next = head;
            head = n;
            node = node.next;
        }

        return head;
    }
}
/**
 *To reverse a linkedlist, you have to think for a second
 * Usually when you go about it, you'll add a connection to the tail node
 * Then move tail up
 * But what would happen if you create a new node, set it's next = to your current head
 * Then move head up
 *
 * You'll effectively, be adding nodes to the front of the list, instead of the back
 * So if you receive, a head node of a linked list, you can effectively reverse the list
 */