package org.example;

import org.example.practice.Node;

/*
* Given only a middle node to delete, remove it's reference from the list
*
* */
public class DeleteMiddleNode {

    //Think about pass by reference, and how that affects this algorithm
    public void algoOne(Node middlenode) {


        if ( middlenode == null){
            return;
        }

        middlenode = middlenode.next;
    }
}
