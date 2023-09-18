package org.example;

import org.example.practice.Node;

/*
* Given only a middle node to delete, remove it's reference from the list
* */
public class DeleteMiddleNode {


    public void algoOne(Node head, Node middlenode) {
        if (head == null || middlenode == null){
            return;
        }

        while(head.next != null){

            if(head.next.data == middlenode.data){
                head.next = head.next.next;
            }

            head = head.next;
        }
    }
}
