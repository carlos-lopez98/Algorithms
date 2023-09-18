package org.example.practice;

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

public class Partition {




    public Node  algoOne(Node input, int x){
        Node head = input;
        Node tail = input;

        while (input != null){
            Node next = input.next;

            if(input.data >= x){
                tail.next = input;
                tail = input;
            }else{
                input.next = head;
                head = input;
            }

            input = input.next;
        }
        tail.next = null;
        return head;
    }
}
