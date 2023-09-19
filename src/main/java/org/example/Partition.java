package org.example;

/*
* Write code to partition a linked list arounda  value x
* Such that all nodes less than x come before all nodes gte >= x
* If x is contained within the list, the values of x only need to be after the elements lt < x
*
* The partition element x can appear anywhere in the "right partition"
* it does not need to appear between the left and right partitions
*
* input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [x=5]
* output: 1 -> 2 -> 3 -> 5 -> 8 -> 5 -> 10
*
* */

import org.example.practice.Node;

public class Partition {




    public Node algoOne(Node input, int x) {
        Node rightHead = null;
        Node rightTail = null;
        Node leftHead = null;
        Node leftTail = null;

        while(input != null){
        //input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [x=5]

            //Think about each node, having a pointer to the next node
            //Before you grab your node, you need to break it's next pointer
            Node next = input.next;
            input.next = null;

            if(input.data >= x){
                if(rightHead == null){
                    rightHead = input;
                    rightTail = input;
                }else{
                    rightTail.next = input;
                    rightTail = input;
                }
            }else{
                if(leftHead == null){
                    leftHead = input;
                    leftTail = input;
                } else{
                    leftTail.next = input;
                    leftTail = input;
                }
            }

            //Moves the iterations forward
            input = next;
        }

        if(leftHead == null){
            return rightHead;
        }

        leftTail.next = rightHead;

        //Return the head reference to the newly arranged list
        return leftHead;
    }
}
