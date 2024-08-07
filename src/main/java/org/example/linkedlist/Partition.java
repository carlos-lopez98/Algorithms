package org.example.linkedlist;

import org.example.practice.Node;

/**
 * Write code to partition a linked list around a value x, such that all nodes less than x
 * Come before all nodes greater than or equal to x. (Important) the partition element x can appear anywhere in the
 * "right partition" it does not need to appear between the left and right partitions.
 * <p>
 * Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1
 * <p>
 * OutPut: 3 -> 1 -> 2       ->      10 -> 5 -> 5 -> 8
 * <p>
 * Notice how 5 does not have to be in the center, it's just left partition is elements less than 5
 * Right partition is elements greater than 5
 */
public class Partition {


    public static void partitionTheListUsingTwoSeparateLists(Node head, int partition) {

        Node beforeStart = new Node();
        Node beforeEnd = new Node();
        Node afterStart = new Node();
        Node afterEnd = new Node();

        beforeStart.next = beforeEnd;
        afterStart.next =afterEnd;

        Node current = head;

        while(current != null){

        }

    }
}

/**
 * Solution 1:
 * With the above solution we plan on creating two linkedlists one that stores elements
 * Smaller than the partition and one that stores elements larger than the partition
 * Then at the end you can join these together
 *
 * For this solution you have to take note of how a linkedlist works, remember that with a
 * LinkedList you can only add nodes to the head or tail, you also have to take into account
 * How you'll add elements in, and the obvious edge case of adding the first node to the list
 * This node will end up becoming the head and tail for the first iteration
 */