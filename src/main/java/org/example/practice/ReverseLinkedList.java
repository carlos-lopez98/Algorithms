package org.example.practice;

public class ReverseLinkedList {

    public static Node reverseList(Node head) {
        Node newHead = null;

        while (head != null){


            // Equal to 2
            Node temp = new Node(head.data);

            temp.next = newHead;

            //Points to 2
            newHead = temp;

            head = head.next;
        }

        return newHead;
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