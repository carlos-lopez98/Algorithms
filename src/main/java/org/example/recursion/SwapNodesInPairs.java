package org.example.recursion;

public class SwapNodesInPairs {

     public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    //Singly linked list
    //Only pointing in one direction
    public ListNode swapPairs(ListNode head){
         if(head == null || head.next == null){
             return head;
         }

         ListNode first = head;
         ListNode second = head.next;

        first.next = swapPairs(head.next.next);

        //second.next is head.next.next - so we can't change this
        //until after we perform the swap if not, then we get an infinite loop
        second.next = first;

        return second;
    }
}
