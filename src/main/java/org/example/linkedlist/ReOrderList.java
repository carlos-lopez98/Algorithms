package org.example.linkedlist;

import org.example.practice.Node;

/**
 * You are given the head of a singly linked-list. The list can be represented as:
 *
 * L0 → L1 → … → Ln - 1 → Ln
 * Reorder the list to be on the following form:
 *
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 *
 * Example 1:
 * Input: head = [1,2,3,4]
 * Output: [1,4,2,3]
 *
 * Example 2:
 * Input: head = [1,2,3,4,5]
 * Output: [1,5,2,4,3]
 *
 * Constraints:
 * The number of nodes in the list is in the range [1, 5 * 104].
 * 1 <= Node.val <= 1000
 */

//This problem has three takeaways
    //Must Know how to use and implement fast and slow pointers
    //Must know about reversing linked lists
    //Must know how to do interleaving merging

public class ReOrderList {



    public static void reOrder(Node head) {
        Node slow = head;
        Node fast = head;
        Node prev = new Node();

        while(fast != null && fast.next != null){

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        reverseList(slow);
    }


    public static Node reverseList(Node head){
        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void merge(Node one, Node two){

        while(one != null && two != null){
            Node tempOne = one.next;
            Node tempTwo = two.next;

            one.next = two;

            if(tempOne == null) break;
            two.next = tempOne;
            one = tempOne;
            two = tempTwo;
        }
    }
}
