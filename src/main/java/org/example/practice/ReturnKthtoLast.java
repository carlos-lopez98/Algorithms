package org.example.practice;


/*
* Implement an algorithm to find the kth to last element of a singly linked list
* */
public class ReturnKthtoLast {


    int counter = 0;

    public  ReturnKthtoLast(){};
    public Node algoOne(Node head,int kthToLast){
        if(head == null) return null;





        return head;
    }


    private Node backtrack(Node currentCall, int kthToLast){
        //Recursive Call breaker
        if(currentCall == null){
            return null;
        }

        Node n = backtrack(currentCall, kthToLast);

        counter++;

        if(counter == kthToLast){
            return currentCall;
        }

        return n;
    }

}
