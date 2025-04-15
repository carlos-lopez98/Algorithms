package org.example.linkedlist;

import org.example.practice.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * Write code to remove duplicates from an unsorted linked list
 * <p>
 * How would you solve this problem if a temporary buffer is not allowed?
 */

public class RemoveDups {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    //Easy solution that's in place doesn't require a set to keep track of the duplicates
    public static ListNode algoOne(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode curr = head;

        while (curr != null){

            while(curr.next != null && curr.val == curr.next.val){
                curr.next = curr.next.next;
            }

            curr = curr.next;
        }

        return head;
    }
}