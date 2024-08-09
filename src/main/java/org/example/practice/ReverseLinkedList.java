package org.example.practice;

public class ReverseLinkedList {


    public static Node reverseList(Node node) {
        //First create a pointer to our new reversed list
        Node head = null;

        //Start iterating through our input list
        while (node != null) {

            //Create a new node to create the links
            Node n = new Node(node.data);
            //Link our new node to our head, head value will then change
            n.next = head;
            //Move head up, this effectively adds elements in reverse
            //So if you have 1, 2, 3, 4

            //You'll add 1 at the end
            //Then add 2 -> 1
            //3 -> 2 -> 1
            //4 -> 3 -> 2 -> 1
            head = n;

            //Move pointer up for iteration
            node = node.next;
        }
        return head;
    }
}
/**
 * To reverse a linkedlist, you have to think for a second
 * Usually when you go about it, you'll add a connection to the tail node
 * Then move tail up
 * But what would happen if you create a new node, set it's next = to your current head
 * Then move head up
 * <p>
 * You'll effectively, be adding nodes to the front of the list, instead of the back
 * So if you receive, a head node of a linked list, you can effectively reverse the list
 */