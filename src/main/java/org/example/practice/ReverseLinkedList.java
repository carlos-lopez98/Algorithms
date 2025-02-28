package org.example.practice;

public class ReverseLinkedList {

    public static Node reverseList(Node node) {

        //Head of the return list - must return reverse
        Node head = new Node();

        //Iterate through non-reversed list
        while (node != null){
            //Creates a new node = to the current node
            Node temp = new Node(node.data);

            //Set temp.next = to previous node
            temp.next = head;

            //Move head backwards - usually a tail pointer would go towards the end of the list
            //In this case you move backwards
            head = temp;
        }

        //At the end you return a list in reverse 4 -> 3 -> 2 -> 1
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