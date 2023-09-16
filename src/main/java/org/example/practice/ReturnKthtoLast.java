package org.example.practice;


/*
 * Implement an algorithm to find the kth to last element of a singly linked list
 * */
public class ReturnKthtoLast {

    int counter = -1;

    public ReturnKthtoLast() {
    }

    public Node algoOne(Node head, int kthToLast) {
        //LinkList is null
        if (head == null) return null;

        //If not start Looping
        return backtrack(head, kthToLast);
    }


    private Node backtrack(Node currentCall, int kthToLast) {
        //Recursive Call breaker
        if (currentCall == null) {
            return null;
        }

        Node n = backtrack(currentCall.next, kthToLast);

        //Counter will be zero
        counter++;

        //Unless kthToLast is one
        if (counter == kthToLast) {
            return currentCall;
        }

        return n;
    }

}
