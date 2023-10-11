package org.example;

import org.example.practice.Node;

/*
* Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting node
* . Note that the intersection is defined by reference , not value. That is, if the kth node of
* the first linked list is the exact same node (by reference) as the jth node of the second linked list,
* then they are intersecting.
* */
public class IntersectionLinkedList {

        //Get the difference of each list -- this will give you where the pointer should start in the greater list
        public static Node intersection(Node headOne, Node headTwo){
            Node intersecting = null;
            Node pointerListOne = headOne;
            int sizeListOne = 0;

            Node pointerListTwo = headOne;
            int sizeListTwo = 0;

            while(pointerListOne != null){
                sizeListOne++;
                pointerListOne = pointerListOne.next;
            }

            while(pointerListTwo != null){
                sizeListTwo++;
                pointerListTwo = pointerListTwo.next;
            }

            return intersecting;
        }
}
